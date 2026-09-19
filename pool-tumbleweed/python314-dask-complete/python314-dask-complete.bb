SUMMARY = "All dask components"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers. \
 \
This package pulls in all the optional dask components."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-dask-complete-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "b733ffaf981d4e54423f58e07da2a32804b27f909fd59a1b0ad7a62228a7465ac9f2fa87cc89dff485ed7c4a6c95d97d1177def0e1cf6ce015e9b8a1fa843da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-all \
python314-dask-complete"

RDEPENDS:${PN} += "python314-dask \
python314-dask-array \
python314-dask-dataframe \
python314-dask-diagnostics \
python314-dask-distributed \
python314-lz4 \
python314-pyarrow"

inherit rpm
