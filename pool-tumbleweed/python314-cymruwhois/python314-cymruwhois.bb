SUMMARY = "Client for the whois.cymrucom service"
DESCRIPTION = "Perform lookups by ip address and return ASN, Country Code, \
and Netblock Owner."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python314-cymruwhois-1.6-3.5.noarch.rpm"
RPM_HASH = "64add9811eab851de50da00a7f6142264a27e723eda184bf1d5a1fa6ed619dbb21d5e69c4ce8804e471b67553bac242955b2c309f32b6b6d8ba58a5d7c60bb7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cymruwhois \
python3.14dist-cymruwhois \
python314-cymruwhois \
python3dist-cymruwhois"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
