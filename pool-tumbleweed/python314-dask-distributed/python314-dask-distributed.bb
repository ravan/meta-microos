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

RPM_NAME = "python314-dask-distributed-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "56d014d66412cf0b8f86787c1cc0a54ba84e2c43c6f1ed719a1790a1400016c6f7bccd5e7d16282c8f39acc05aee133569d70d0c0d1df052beef3183820cb019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-distributed"

RDEPENDS:${PN} += "python314-dask \
python314-distributed"

inherit rpm
