SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python314-PyBindGen-0.22.1-2.6.noarch.rpm"
RPM_HASH = "33fe3064e421261f12465e851de6eb15ed1ee8d877234aaa3bf1d81f4d45befa35784ff16f6568dd1a2a8c79f9a7f60fe23be1f34a584401372a357ba8599f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pybindgen \
python314-PyBindGen \
python3dist-pybindgen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
