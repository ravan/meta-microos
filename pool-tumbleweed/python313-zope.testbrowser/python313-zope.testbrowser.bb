SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "8.0"

RPM_NAME = "python313-zope.testbrowser-8.0-1.4.noarch.rpm"
RPM_HASH = "e1b4f73eff8597fa5a3c98f1ff0b71156f9b5c151257839dd9c17a69baf4c2b97a39943017572a8601201ffaa3be1f3e5f90f4e86b68472ab1332291de8a5861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser \
python3.13dist-zope.testbrowser \
python313-zope.testbrowser \
python3dist-zope.testbrowser"

RDEPENDS:${PN} += "python-abi \
python313-WSGIProxy2 \
python313-WebTest \
python313-beautifulsoup4 \
python313-legacy-cgi \
python313-pytz \
python313-setuptools \
python313-soupsieve \
python313-zope.cachedescriptors \
python313-zope.interface \
python313-zope.schema"

inherit rpm
