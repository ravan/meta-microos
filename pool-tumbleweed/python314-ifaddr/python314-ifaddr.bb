SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-ifaddr-0.2.0-4.5.noarch.rpm"
RPM_HASH = "57a3a76d8698a83cea2ef0153220df8189653647aa4d214dfce44f1c8ff5f88f6647a3a4a649043f542498dd106b3cab567c586682e71d5584645b42d3784b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ifaddr \
python314-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
