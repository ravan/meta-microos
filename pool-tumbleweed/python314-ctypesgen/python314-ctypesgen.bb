SUMMARY = "Python wrapper generator for ctypes"
DESCRIPTION = "ctypesgen is a pure-python ctypes wrapper generator. It parses C header files \
and creates a wrapper for libraries based on what it finds."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python314-ctypesgen-1.1.1-2.5.noarch.rpm"
RPM_HASH = "ae77451422a48a66b96dc950db628857e436c749e86c4c7ffa48bf463839b1f9a2f6615a170001ed1247b018d48dbdf4a4fbf5e99edf9bc0247fae82a8be6d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ctypesgen \
python314-ctypesgen \
python3dist-ctypesgen"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
