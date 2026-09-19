SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "8.3"

RPM_NAME = "python313-zope.testrunner-8.3-1.1.noarch.rpm"
RPM_HASH = "ba300a1ea6899e7c5b08fa0c2afe15f7e1db9ebd1e2652b463b1c4edb21f9d862aa216f45b547c4d93773016531a407bdf5e13bffd7a8350ccb423f5249a4eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testrunner \
python3.13dist-zope.testrunner \
python313-zope.testrunner \
python3dist-zope.testrunner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-zope.exceptions \
python313-zope.interface"

inherit rpm
