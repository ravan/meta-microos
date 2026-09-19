SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "8.0"

RPM_NAME = "python313-zope.testbrowser-test-8.0-1.4.noarch.rpm"
RPM_HASH = "bc9a4c0fdcd3591453c9b4a85f26c6556d4c86cc4d595faf15448d05cfe575035615386be3b7cfec8907e4344134fc0a7136153c820007ebffdf53a1f0012461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.testbrowser-test \
python313-zope.testbrowser-test"

RDEPENDS:${PN} += "python313-WSGIProxy2 \
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
