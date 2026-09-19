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

RPM_NAME = "python313-dask-complete-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "f8e297d8aa62a6a659aa8e422f6fd47c05a216dbd6923baa0962ff542c0123760a341ad495f7fc026582baa4b257c3701424d2462bf88688c4c7d6725f45f1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-all \
python3-dask-complete \
python313-dask-all \
python313-dask-complete"

RDEPENDS:${PN} += "python313-dask \
python313-dask-array \
python313-dask-dataframe \
python313-dask-diagnostics \
python313-dask-distributed \
python313-lz4 \
python313-pyarrow"

inherit rpm
