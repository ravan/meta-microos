SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "3.0.2"

RPM_NAME = "python314-waitress-3.0.2-1.8.noarch.rpm"
RPM_HASH = "c92a20f7fdea603effe3fdb7c9260bf66f47b98566c3ac3297f8eb3ce90d952e794b8889ec5ba90ce57cb9992c56b20ea58316b3ded013e576c027badae72233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-waitress \
python314-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
