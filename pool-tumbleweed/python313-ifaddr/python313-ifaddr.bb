SUMMARY = "Module for enumerating IP addresses on system network adapters"
DESCRIPTION = "ifaddr is a Python library that allows finding the \
IP addresses assigned to the system."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python313-ifaddr-0.2.0-4.5.noarch.rpm"
RPM_HASH = "4c8641db4c2471170bf311cc4ee431940cd4d614dd0f38005c6354ea457ab9f791986b2794ede8fbe28a9269cc84ed13aee0af48425cccac0560af2c8c2561b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ifaddr \
python3.13dist-ifaddr \
python313-ifaddr \
python3dist-ifaddr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
