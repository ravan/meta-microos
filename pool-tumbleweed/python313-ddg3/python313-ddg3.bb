SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.8"

RPM_NAME = "python313-ddg3-0.6.8-1.2.noarch.rpm"
RPM_HASH = "a4b570c88c2b2500997e762b5acb19e076b98afa9240ff576bbff89d996fcf9f1b9093af42f5d4dda5cc3bf6d3c96027cae5a17e63f763f94eefa77753a78c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddg3 \
python3.13dist-ddg3 \
python313-ddg3 \
python3dist-ddg3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-requests \
update-alternatives"

inherit rpm
