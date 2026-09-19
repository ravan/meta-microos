SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "8.3"

RPM_NAME = "python314-zope.testrunner-8.3-1.1.noarch.rpm"
RPM_HASH = "c21a86895ea455eef6863a0b02167ce9b86aa683277bfc245b3407911d58b67b25a80fa57ab378d60cca3b6c2b8ceebfd1285d09bf77ccde042a076efc8ff09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.testrunner \
python314-zope.testrunner \
python3dist-zope.testrunner"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-zope.exceptions \
python314-zope.interface"

inherit rpm
