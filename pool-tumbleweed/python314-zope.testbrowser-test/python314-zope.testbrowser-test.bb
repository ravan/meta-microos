SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "8.0"

RPM_NAME = "python314-zope.testbrowser-test-8.0-1.4.noarch.rpm"
RPM_HASH = "07a2d75256ac4bb95feed980d9d371d1177ced5d8aec42fcdb05960df73fecf0d74f5ef7f38fb0340600e13d1eedd9ee41b8e449737480a955ce030b009bf678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-zope.testbrowser-test"

RDEPENDS:${PN} += "python314-WSGIProxy2 \
python314-WebTest \
python314-beautifulsoup4 \
python314-legacy-cgi \
python314-pytz \
python314-setuptools \
python314-soupsieve \
python314-zope.cachedescriptors \
python314-zope.interface \
python314-zope.schema"

inherit rpm
