SUMMARY = "C parser in Python"
DESCRIPTION = "pycparser is a complete parser of the C language, written in pure Python using \
the PLY parsing library. It parses C code into an AST and can serve as a \
front-end for C compilers or analysis tools."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python314-pycparser-3.0-1.3.noarch.rpm"
RPM_HASH = "55d89fb42f98217c3eae31a7377206e5654d40fd360b2b6b819a73096281240f4e8f3a97344c8a201f592a11baa1fe429638753e0275db1ad257bdfd6f3f8599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycparser \
python314-pycparser \
python3dist-pycparser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
