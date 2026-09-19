SUMMARY = "Python wrapper generator for ctypes"
DESCRIPTION = "ctypesgen is a pure-python ctypes wrapper generator. It parses C header files \
and creates a wrapper for libraries based on what it finds."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python313-ctypesgen-1.1.1-2.5.noarch.rpm"
RPM_HASH = "72d87df4b6fcf515ca3120a8f62798b84b2e513ed956ad8537819ca61ec5da27294fb3898f2ee210106ab00333f51804ddaa3c60b0691bfb2fa0798f205f1ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ctypesgen \
python3.13dist-ctypesgen \
python313-ctypesgen \
python3dist-ctypesgen"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
