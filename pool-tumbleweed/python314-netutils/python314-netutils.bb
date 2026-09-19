SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.19.1"

RPM_NAME = "python314-netutils-1.19.1-1.1.noarch.rpm"
RPM_HASH = "2ffbfe6f21124636a8d08f10f20cc388a11357660d4857e49b0600a0dbcdd936e1e0df9008c5dee9f9b03a816278a8375ba0f1a494f6c56e91a0d3b8587c2407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-netutils \
python314-netutils \
python3dist-netutils"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
