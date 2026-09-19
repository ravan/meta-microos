SUMMARY = "The Mozc engine for IBus"
DESCRIPTION = "The Mozc engine for IBus provides a Japanese input method."
LICENSE = "Apache-2.0 & BSD-3-Clause & SUSE-Public-Domain & Zlib"

PV = "3.33.6133.102"

RPM_NAME = "ibus-mozc-3.33.6133.102-2.2.aarch64.rpm"
RPM_HASH = "af3c225f4edc35319778ea35c18672e8b8ea3a40c5a3b615e25ea96d1d7f9e55482b396ff7f5fd07318cf1bc8a3589bc02480af5e3afa6020dd686bfbfcdd551"

RPROVIDES:${PN} += "ibus-mozc \
locale-ibus-ja"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libm.so.6 \
libstdc++.so.6 \
mozc \
mozc-gui-tools"

inherit rpm
