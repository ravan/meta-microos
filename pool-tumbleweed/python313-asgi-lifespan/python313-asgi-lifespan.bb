SUMMARY = "Programmatic startup/shutdown of ASGI apps"
DESCRIPTION = "Programmatic startup/shutdown of ASGI apps."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-asgi-lifespan-2.1.0-2.2.noarch.rpm"
RPM_HASH = "8ddf3e788ac07cfed2b73e9366963c1c2cb56ab03a67a1d55646fdf94d5170ee1ba4e8c212f001533b9d4db2d1f86fb719d2c5680205fbed1588c0226f86d347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asgi-lifespan \
python3.13dist-asgi-lifespan \
python313-asgi-lifespan \
python3dist-asgi-lifespan"

RDEPENDS:${PN} += "python-abi \
python313-sniffio"

inherit rpm
