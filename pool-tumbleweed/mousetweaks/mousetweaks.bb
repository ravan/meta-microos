SUMMARY = "GNOME mouse settings tweaker"
DESCRIPTION = "The Mousetweaks package provides mouse accessibility enhancements for \
the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "3.32.0"

RPM_NAME = "mousetweaks-3.32.0-4.1.aarch64.rpm"
RPM_HASH = "5cd08f38f407929cde5228a1221f3cf337d03190b74528e207ef2f6a2cfbfd634518ce45de08592ef31aceede3a3d628fab09987f5dbf418ff238011abafc30b"

RPROVIDES:${PN} += "mousetweaks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
