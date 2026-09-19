SUMMARY = "Waitress WSGI server"
DESCRIPTION = "Waitress is a pure-Python WSGI server. It has no dependencies except \
ones which live in the Python standard library. It supports HTTP/1.0 \
and HTTP/1.1. \
 \
For more information, see the 'docs' directory of the Waitress package or \
http://docs.pylonsproject.org/projects/waitress/en/latest/ ."
LICENSE = "ZPL-2.1"

PV = "3.0.2"

RPM_NAME = "python313-waitress-3.0.2-1.8.noarch.rpm"
RPM_HASH = "1a6caa3275fd88cb059dfafd7e10eaf49f115b54291c8bc80bd6d525ea433bd531ada028d7e57ecbce584e7ee2be0da51ade2880a768e960f4bd2f313780651f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-waitress \
python3.13dist-waitress \
python313-waitress \
python3dist-waitress"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
