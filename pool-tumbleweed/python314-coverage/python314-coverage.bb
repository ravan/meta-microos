SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.14.3"

RPM_NAME = "python314-coverage-7.14.3-2.1.aarch64.rpm"
RPM_HASH = "641a9a51b56e7aafd85dd4194237f4e8b1760de839c5491d839365e35d5b60ebdd570b86e367a78d308df528f6d8c9a97a1eb5b73273d54591c8aca8c391ab7a"

RPROVIDES:${PN} += "python3.14dist-coverage \
python314-coverage \
python3dist-coverage"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314"

inherit rpm
