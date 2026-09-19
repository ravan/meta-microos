SUMMARY = "COSMIC app store"
DESCRIPTION = "COSMIC app store."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-store-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "74d3dc2d9e1193f5986afd63a7129441177eea505f4eff68da303648dd5176167ae2d897d5067477be3e3b301d4eaddfec9a9999eae09311ad1d99d7b281f49c"

RPROVIDES:${PN} += "cosmic-store"

RDEPENDS:${PN} += "libc.so.6 \
libflatpak.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
