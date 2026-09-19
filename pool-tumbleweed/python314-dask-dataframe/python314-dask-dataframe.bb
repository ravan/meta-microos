SUMMARY = "Pandas-like DataFrame data structure for dask"
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
This package contains the dask DataFrame class. \
 \
A Dask DataFrame is a large parallel dataframe composed of many \
smaller Pandas dataframes, split along the index. These pandas \
dataframes may live on disk for larger-than-memory computing \
on a single machine, or on many different machines in a cluster."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-dask-dataframe-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "33857ccc2726adef6ae84196d4ccff921b362545666a5ae82b8af5e6a4ebde13c7c43843c70adee5b2096e41f2bfc9a5c66c94d4b76846aa480722083ed9fb8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python314-dask \
python314-dask-array \
python314-pandas \
python314-pyarrow"

inherit rpm
