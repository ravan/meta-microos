SUMMARY = "Python bindings for libmsym"
DESCRIPTION = "This package contains the python bindings needed to develop \
python applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python313-libmsym-0.2.3-4.3.noarch.rpm"
RPM_HASH = "bc3a26dcc32d0bae2f335a161e90c08dcea3aace243f1ac5a32a09ef2f5dfebc8b9c109d600ce27564f175ff3a1f43b4adfc8e435a6e2a83aac9541aeea3bd55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libmsym \
python3.13dist-libmsym \
python313-libmsym \
python3dist-libmsym"

RDEPENDS:${PN} += "python-abi"

inherit rpm
