SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python313-sgmllib3k-1.0.0-6.5.noarch.rpm"
RPM_HASH = "6d48cf8dadf7a0f9eb3f3b5d68c2299e2d1e8ebaf92eb49b559ea1204d6a08779449ef1905c3f8133f7524bd37f31c58033854af1864509b6b12c2800ec3f289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sgmllib3k \
python3.13dist-sgmllib3k \
python313-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
