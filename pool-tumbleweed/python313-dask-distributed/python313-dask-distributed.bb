SUMMARY = "Interface with the distributed task scheduler in dask"
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
This meta package pulls in the distributed module into the dask namespace."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python313-dask-distributed-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "4b911e5c2a059eaac8d3e4d497cb492041e5828e52d430ac84383eb5cc2f8a9367e97e875a03297e6ac25f9bfe3db1094fbec34794d43a4be6bf4b8aadf37a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-distributed \
python313-dask-distributed"

RDEPENDS:${PN} += "python313-dask \
python313-distributed"

inherit rpm
