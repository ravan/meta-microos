SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python313-cymruwhois-1.6-3.5.noarch.rpm"
RPM_HASH = "3320e6669d68851c343cc2d0d9acc8555c28b590bc50a1020e958018ab1a9cd9a22a1f602a379743b50244e04982700f6a801f1b792ffc765692bd0dd3d63037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3-cymruwhois \
python3.13dist-cymruwhois \
python313-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
