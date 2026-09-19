SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.13.4"

RPM_NAME = "python313-bottle-0.13.4-3.5.noarch.rpm"
RPM_HASH = "884250a3e397da104f6f3e1f64af8d049df62bfeef25beb6ef87410c7dd61d4679c1b52f1b550496aa8754ec68ca1551cee45bc1da5bd87f77e2d983e946d220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bottle \
python3.13dist-bottle \
python313-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
