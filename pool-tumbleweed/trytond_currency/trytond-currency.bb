SUMMARY = "The 'currency' module for the Tryton ERP system"
DESCRIPTION = "The currency module defines the concepts of currency and rate \
in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "7.0.1"

RPM_NAME = "trytond_currency-7.0.1-1.4.noarch.rpm"
RPM_HASH = "b53715a2a4066aefa54afcf137027e5138bc4defd24902f248e14a329e30f624ac57324b199f333f0d3b2bcf96a601825f448c27be06ed96b2407f41ba792b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-currency \
python3dist-trytond-currency \
trytond-currency"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
group-tryton \
python-abi \
trytond"

inherit rpm
