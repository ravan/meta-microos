SUMMARY = "Python interface for libheif library"
DESCRIPTION = "Python interface for libheif library"
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python313-pillow-heif-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "5a79ac3f44e93c5dc9941b6f3c9a01b2972f6f83318bea5038c79f1790385adef8b98c5bb8fe9d69e4e604e68542889c4f1a501087c010283d9f8ba32bb80f4d"

RPROVIDES:${PN} += "python3-pillow-heif \
python3.13dist-pillow-heif \
python313-pillow-heif \
python3dist-pillow-heif"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libheif.so.1 \
python-abi \
python313-Pillow"

inherit rpm
