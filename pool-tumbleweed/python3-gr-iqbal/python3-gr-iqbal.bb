SUMMARY = "Python bindings for gr-iqbal"
DESCRIPTION = "The Python Bindings for gr-iqbal."
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20250425"

RPM_NAME = "python3-gr-iqbal-0.39.0git20250425-1.5.aarch64.rpm"
RPM_HASH = "488fe3004e3fc8dc8ab3fd4fe8ca838903b95166eb38a42fbfdec0cb17b38747fa80e52abea6d48754cf5410cf18c8475b32964c3b31b1b9791e255a44f033b8"

RPROVIDES:${PN} += "python3-gr-iqbal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0 \
libgnuradio-runtime.so.3.10.12 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
