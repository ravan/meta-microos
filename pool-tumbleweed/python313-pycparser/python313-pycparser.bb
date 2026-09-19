SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python313-pycparser-3.0-1.3.noarch.rpm"
RPM_HASH = "39c34a34243fc5ed9275558edc34f5689a29481153720a646ddcb2c504f45f6f5dd5fba493b7d2cebfdba6edb896f736fc250bc2d2405deabf5d44f1552b110e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycparser \
python3.13dist-pycparser \
python313-pycparser \
python3dist-pycparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
