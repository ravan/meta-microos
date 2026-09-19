SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.13.2"

RPM_NAME = "python314-antlr4-python3-runtime-4.13.2-2.5.noarch.rpm"
RPM_HASH = "e0bd03400500593428f371a46b6e55668b40023fc10a5d9a2dd82b71f06dc7dd5d6aaaaa580c3c988dc03b967d261e07a51343f717c009597e3cbf0cad23af17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-antlr4-python3-runtime \
python314-antlr4-python3-runtime \
python3dist-antlr4-python3-runtime"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
