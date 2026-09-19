SUMMARY = "Numpy-like array data structure for dask"
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
This package contains the dask array class. \
 \
Dask arrays implement a subset of the NumPy interface on large \
arrays using blocked algorithms and task scheduling."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-dask-array-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "dd8af620e686a0fb43550e580d89e9bdbea1a1ce1857b6304bed1251d0c1619dfb67f7c09a7a3c686a703656638becb50f51b07fc13db50236207663da6159a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-array"

RDEPENDS:${PN} += "python-abi \
python314-dask \
python314-dask-delayed \
python314-numpy"

inherit rpm
