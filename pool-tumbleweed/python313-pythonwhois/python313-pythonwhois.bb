SUMMARY = "Python whois library"
DESCRIPTION = "Module for retrieving and parsing the WHOIS data for a domain."
LICENSE = "WTFPL"

PV = "2.4.3"

RPM_NAME = "python313-pythonwhois-2.4.3-6.10.noarch.rpm"
RPM_HASH = "c8dcfdff8b3610412f38759bae1abeea8331bd18d3d2dbd0feb85bea52279a0135ab843e21cd3bc403203ead15f2a6cfe2539d2fde232e83a0e65297f4799334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythonwhois \
python3.13dist-pythonwhois \
python313-pythonwhois \
python3dist-pythonwhois"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
