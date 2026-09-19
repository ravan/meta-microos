SUMMARY = "Diagnostics for dask"
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
This package contains the dask.diagnostics module"
LICENSE = "BSD-3-Clause"

PV = "2026.6.0"

RPM_NAME = "python313-dask-diagnostics-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "0262a7b714495b4c1cf3e83e2d8fbee76c31957db7d65d24f76a32dddd2aedb9fa1d3fc15ea5bbbad6bbcffa5c022c3193ccada66a85afd66b9df717aa0f2cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dask-diagnostics \
python313-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-bokeh \
python313-dask"

inherit rpm
