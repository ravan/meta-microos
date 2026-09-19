SUMMARY = "Code coverage measurement for Python"
DESCRIPTION = "Coverage.py measures code coverage, typically during test execution. It uses \
the code analysis tools and tracing hooks provided in the Python standard \
library to determine which lines are executable, and which have been executed."
LICENSE = "Apache-2.0"

PV = "7.14.3"

RPM_NAME = "python313-coverage-7.14.3-2.1.aarch64.rpm"
RPM_HASH = "0a9e97586bcd20206953013ada0851e263add344c8282c398ee2bd205176f5b4b29b37832aa63c44fe9cef9e1da5037ed69d64fbd9ac5e70830f29ae8c66fa4f"

RPROVIDES:${PN} += "python3-coverage \
python3.13dist-coverage \
python313-coverage \
python3dist-coverage"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313"

inherit rpm
