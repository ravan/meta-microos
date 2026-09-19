SUMMARY = "The 'party' module for the Tryton ERP system"
DESCRIPTION = "The party module defines the concepts of party, category and contact \
mechanism in the Tryton application platform. It also comes with \
reports to print labels and letters and a 'Check VIES' wizard."
LICENSE = "GPL-3.0-only"

PV = "7.0.7"

RPM_NAME = "trytond_party-7.0.7-1.3.noarch.rpm"
RPM_HASH = "b1fafdddaab150dfa050d882838f0773ba96616749159aa0595b65b402aefed9c6839a79e0add49b1a55fc676bc7e4430f78bb81361ac3647cfb9ceddb0eaa74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-party \
python3dist-trytond-party \
trytond-party"

RDEPENDS:${PN} += "python-abi \
python3-python-stdnum \
trytond \
trytond-country"

inherit rpm
