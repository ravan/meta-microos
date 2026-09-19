SUMMARY = "A reusable Django app for queuing the sending of email"
DESCRIPTION = "A reusable Django app for queuing and throttling of email sending, scheduled sending, \
consolidation of multiple notifications into single emails and logging of mail failures."
LICENSE = "MIT"

PV = "2.3.2"

RPM_NAME = "python313-django-mailer-2.3.2-2.5.noarch.rpm"
RPM_HASH = "811cd191efd4f1bdb1901ebdc30a4ebd009795e56c5001657f7e2e65a616eb9f4b5d6f1782bf33e1978b419b2f6a7af09ad2d710c8246cd6531538323062d6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-mailer \
python3.13dist-django-mailer \
python313-django-mailer \
python3dist-django-mailer"

RDEPENDS:${PN} += "python-abi \
python313-Django \
python313-lockfile"

inherit rpm
