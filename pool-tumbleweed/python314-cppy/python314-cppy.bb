SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "python314-cppy-1.3.1-1.5.noarch.rpm"
RPM_HASH = "2cee59ff0e455a40705141f0122c59dbafc3f3a3fb0f5fb8bbde77df6f10edffa7cc76a498b5072c99c4248242de63631830a52498b870debb941bd1e490ed45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cppy \
python314-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
