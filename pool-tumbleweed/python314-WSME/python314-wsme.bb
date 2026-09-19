SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python314-WSME-0.12.1-4.5.noarch.rpm"
RPM_HASH = "482bd491dd649aa53b807e3f492129d8b43848b051760bf9c25f7bb4688b57ab1a117180a560c647f2d09f4c442508785d62dc99215b04397c9b3d61619cf39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wsme \
python314-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python314-WebOb \
python314-importlib-metadata \
python314-netaddr \
python314-pytz \
python314-simplegeneric"

inherit rpm
