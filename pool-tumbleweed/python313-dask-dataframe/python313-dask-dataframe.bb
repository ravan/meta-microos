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

RPM_NAME = "python313-dask-dataframe-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "5bf33673dc17ff8407210575a70176664dc2aa40e5106c8f1a01632c5d815d124da57f0068e33c6ca959198eb021d5a2ad032119b5e5b63e17dcd4263cfd370c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-dataframe \
python313-dask-dataframe"

RDEPENDS:${PN} += "python-abi \
python313-dask \
python313-dask-array \
python313-pandas \
python313-pyarrow"

inherit rpm
