SUMMARY = "The 'country' module for the Tryton ERP system"
DESCRIPTION = "The country module defines the concepts of country and subdivision in \
the Tryton application platform. The module comes preloaded with the \
ISO 3166 list of countries and subdivisions thanks to the pycountry \
module."
LICENSE = "GPL-3.0-only"

PV = "7.0.1"

RPM_NAME = "trytond_country-7.0.1-1.2.noarch.rpm"
RPM_HASH = "3e06ff4af9a3c07a2fdd8e4be9be75026d162d75d44b13180399f65cd8ff4f883f4cbb95b9198f1310eddd3ea2b287f19bfc6ebe5620aa5a2bd578d157ab12d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-country \
python3dist-trytond-country \
trytond-country"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
group-tryton \
proteus \
python-abi \
python3-pycountry \
trytond"

inherit rpm
