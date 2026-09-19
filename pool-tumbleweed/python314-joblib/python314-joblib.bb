SUMMARY = "Module for using Python functions as pipeline jobs"
DESCRIPTION = "Joblib is a set of tools to provide lightweight pipelining in \
Python. In particular, joblib offers: \
 \
  1. transparent disk-caching of the output values and lazy re-evaluation \
     (memoize pattern) \
 \
  2. parallel computing \
 \
  3. logging and tracing of the execution \
 \
Joblib can handle large data and has specific optimizations for `numpy` arrays."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "python314-joblib-1.6.0-1.1.noarch.rpm"
RPM_HASH = "118a218d3290a9dfe4e8ec5d4516688fe45f3e6e8a67a1a6dceff1f0c09f89c8e201f31d7a4eb6fdd3e7e34464431e02e2f84b30b0e3b83b20bd22e2f0d306c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-joblib \
python314-joblib \
python3dist-joblib"

RDEPENDS:${PN} += "python-abi \
python314-cloudpickle"

inherit rpm
