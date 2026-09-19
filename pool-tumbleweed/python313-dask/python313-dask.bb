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

RPM_NAME = "python313-dask-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "af527f5b0cf04746dc20ef43252768d8743cd7805bd10d2b879c15d1598eb53a4a22bd72c0ee49d1d6e630fb60b1ffa4c04edbbf6a1fd220a2dde43d00f66ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask \
python3-dask-bag \
python3-dask-delayed \
python3-dask-dot \
python3-dask-multiprocessing \
python3.13dist-dask \
python313-dask \
python313-dask-bag \
python313-dask-delayed \
python313-dask-dot \
python313-dask-multiprocessing \
python3dist-dask"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
python313-click \
python313-cloudpickle \
python313-fsspec \
python313-packaging \
python313-partd \
python313-toolz \
update-alternatives"

inherit rpm
