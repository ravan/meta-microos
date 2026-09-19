SUMMARY = "Programmable browser for functional black-box tests"
DESCRIPTION = "The zope.testbrowser package provides an programmable web browser \
with special focus on testing.  It is used in Zope, but it's not Zope \
specific.  It can be used to test or otherwise interact with any web \
site."
LICENSE = "ZPL-2.1"

PV = "8.0"

RPM_NAME = "python314-zope.testbrowser-8.0-1.4.noarch.rpm"
RPM_HASH = "4951fde11e158d4f3e81a2c94b6cb9a96f09b4afe3be47148db0efc66edbe9a84387c74de7f652e457300450c9ca1f4345b32fd0ea7cd0d62826a7d07ebd1acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zope.testbrowser \
python314-zope.testbrowser \
python3dist-zope.testbrowser"

RDEPENDS:${PN} += "python-abi \
python314-WSGIProxy2 \
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
