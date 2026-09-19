SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.4.3"

RPM_NAME = "python314-zopfli-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "b115b994bdbc89dbc9d579707a0e54d50f0cc5c81e27bce87b3838d88ed36a768e2508d11415b9a6d5e9ed310e180cf992ce55b4ac70c072ae6495c77ac5e2e0"

RPROVIDES:${PN} += "python3.14dist-zopfli \
python314-zopfli \
python3dist-zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzopfli.so.1 \
libzopflipng.so.1 \
python-abi"

inherit rpm
