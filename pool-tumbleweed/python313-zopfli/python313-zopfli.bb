SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python313-zopfli-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "5847d417fb621801aa5593dc98adaa907616022c0494efa8a9360b980eacf2d83e5025f62312bed5c3ba257e12adaf5e944da91c1a7d9639188184aa58095269"

RPROVIDES:${PN} += "python3-zopfli \
python3.13dist-zopfli \
python313-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
