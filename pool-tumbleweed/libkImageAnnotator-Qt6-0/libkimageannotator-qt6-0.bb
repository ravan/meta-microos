SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "libkImageAnnotator-Qt6-0-0.7.2-1.4.aarch64.rpm"
RPM_HASH = "a53a632826bafe6216d9ce4f14dc4470a56590b952a11698721c57578ea75eef274e4f18d081d87802ccc70a2d0cfe88d8731f245ec8cc02f86b0e614946a54f"

RPROVIDES:${PN} += "kImageAnnotator-Qt6-0 \
libkImageAnnotator-Qt6-0 \
libkImageAnnotator-Qt6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkColorPicker-Qt6.so.0 \
libstdc++.so.6"

inherit rpm
