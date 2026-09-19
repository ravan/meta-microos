SUMMARY = "Minimal task scheduling abstraction"
DESCRIPTION = "A flexible library for parallel computing in Python. \
 \
Dask is composed of two parts: \
- Dynamic task scheduling optimized for computation. This is similar to \
  Airflow, Luigi, Celery, or Make, but optimized for interactive \
  computational workloads. \
- “Big Data” collections like parallel arrays, dataframes, and lists that \
  extend common interfaces like NumPy, Pandas, or Python iterators to \
  larger-than-memory or distributed environments. These parallel collections \
  run on top of dynamic task schedulers."
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python314-dask-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "a3e247f664f04db7e345dcc234aed7f501901de7cb6fbe4fa283261b16803dd7e69ec5ea8945da43d0c40913b7a25f1f699024a9ef3f0b7c79413e67abfe2df1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dask \
python314-dask \
python314-dask-bag \
python314-dask-delayed \
python314-dask-dot \
python314-dask-multiprocessing \
python3dist-dask"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-PyYAML \
python314-click \
python314-cloudpickle \
python314-fsspec \
python314-packaging \
python314-partd \
python314-toolz \
update-alternatives"

inherit rpm
