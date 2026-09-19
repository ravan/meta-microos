SUMMARY = "The 'company' module for the Tryton ERP system"
DESCRIPTION = "The company module defines the concepts of company and employee and \
extend the user model in the Tryton application platform."
LICENSE = "GPL-3.0-only"

PV = "7.0.4"

RPM_NAME = "trytond_company-7.0.4-1.1.noarch.rpm"
RPM_HASH = "aa8fca64f6a6f4ecb4a262413cc93564e2b9715d0cabfcf0148aa63f5de217f0db702a764f93b3e52223da3efb4a8870e4a0b36845c2db9d60cc2e08bb2da4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trytond-company \
python3dist-trytond-company \
trytond-company"

RDEPENDS:${PN} += "python-abi \
trytond \
trytond-currency \
trytond-party"

inherit rpm
