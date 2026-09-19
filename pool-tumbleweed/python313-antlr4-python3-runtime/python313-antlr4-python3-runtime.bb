SUMMARY = "ANTLR runtime for Python 3"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for \
reading, processing, executing, or translating structured text or binary files. \
 \
This package contains the runtime for Python 3."
LICENSE = "BSD-3-Clause"

PV = "4.13.2"

RPM_NAME = "python313-antlr4-python3-runtime-4.13.2-2.5.noarch.rpm"
RPM_HASH = "dd23341c6f6eaf25de9262cb8660dc951a17c99e12b35c436a847215e138a07c8917f0db6cc03edd1ce5f0bf9c80db7fb8c24c8704dbeb27d4526959c9439423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-antlr4-python3-runtime \
python3.13dist-antlr4-python3-runtime \
python313-antlr4-python3-runtime \
python3dist-antlr4-python3-runtime"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
