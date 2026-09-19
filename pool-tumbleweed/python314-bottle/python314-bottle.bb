SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.13.4"

RPM_NAME = "python314-bottle-0.13.4-3.5.noarch.rpm"
RPM_HASH = "45cdc6c8163cd42913392eed6cda73c11e14805437d16bfbafdea2e1e59789bf3c1f2d4312d1af6995943c4802f0dfaec28ad021a41e837791d690572fd6352b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bottle \
python314-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
