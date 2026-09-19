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

RPM_NAME = "python314-dask-diagnostics-2026.6.0-1.2.noarch.rpm"
RPM_HASH = "b1e9f7ed8eadd1c32b8933257bbc28f851ecc9a922bd4387019a7977ba8b577f13a3fc8811b4a98f17ec79c70254c6746d4be1e48138addaf2739b6506416c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-dask-diagnostics"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-bokeh \
python314-dask"

inherit rpm
