SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python314-opencensus-context-0.1.3-3.5.noarch.rpm"
RPM_HASH = "80badba3a023378ecff24c737172f11ca6bf6aa445a4eccb0d3f1f0de1b1fcc0ecb9f73a967f74e293ac58ac4c51d00934ac2796bf1c2c12d1966171d1de7525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opencensus-context \
python314-opencensus-context \
python3dist-opencensus-context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
