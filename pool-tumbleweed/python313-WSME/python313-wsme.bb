SUMMARY = "Web Services Made Easy"
DESCRIPTION = "Web Service Made Easy (WSME) is a way to implement webservices \
in Python web applications. \
It is originally a rewrite of TGWebServices \
with focus on extensibility, framework-independence and improved type handling."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python313-WSME-0.12.1-4.5.noarch.rpm"
RPM_HASH = "a68c015bb5d4a5dedad64d53e09f64b5f6fb68da9b4a40d075589e0d2fb04140d0b3f2478d0e129fd1006382478142113b32ea8406b7d143ab0651840da668ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-WSME \
python3.13dist-wsme \
python313-WSME \
python3dist-wsme"

RDEPENDS:${PN} += "python-abi \
python313-WebOb \
python313-importlib-metadata \
python313-netaddr \
python313-pytz \
python313-simplegeneric"

inherit rpm
