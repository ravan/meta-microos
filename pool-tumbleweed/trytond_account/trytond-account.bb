SUMMARY = "The 'account' module for the Tryton ERP system"
DESCRIPTION = "The accounting module of the Tryton application platform. \
It defines fundamentals for most of accounting needs, such as fiscal year, \
period, account type, journal, tax code and more."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.28"

RPM_NAME = "trytond_account-7.0.28-1.1.noarch.rpm"
RPM_HASH = "4be8c6d82480e4937fa478e9b9bdca3802df7b862867137d6f37adac0ed3a565f2bd44f3dc0238f135024e3302317f0795165323547153c2d7891c605b7ee745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-account \
python3dist-trytond-account \
trytond-account"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-company \
trytond-currency \
trytond-party"

inherit rpm
