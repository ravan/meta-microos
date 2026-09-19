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

RPM_NAME = "python313-dask-array-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "7dd4e40ed79f794191a3384e2959c16b8b0a2aa2c5c0c97cce63cc4dd165cd2cfb57e1d8c313d2b6e8e373b6246bd4068e96fbd6b1e3c62f225cf751ba790abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-array \
python313-dask-array"

RDEPENDS:${PN} += "python-abi \
python313-dask \
python313-dask-delayed \
python313-numpy"

inherit rpm
