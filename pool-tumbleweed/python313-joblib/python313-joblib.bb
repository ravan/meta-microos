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

RPM_NAME = "python313-joblib-1.6.0-1.1.noarch.rpm"
RPM_HASH = "01923cfe3001b294a0fd3236f0c61a2c023fd6428ffe0833faa66dced3e4c7cdda4a7b395bb7aae0543cce62c7f8af4313b7b9fbe171204d5067c1bfed8360f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-joblib \
python3.13dist-joblib \
python313-joblib \
python3dist-joblib"

RDEPENDS:${PN} += "python-abi \
python313-cloudpickle"

inherit rpm
