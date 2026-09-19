SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "libkImageAnnotator-Qt5-0-0.7.2-1.3.aarch64.rpm"
RPM_HASH = "2b8f7f26a4d08ad26ddc740cbb57acf99201c6befebe65d8f471614bf64c816b5c811ae9cd810b22f4158f92382f2e5bbc881a994bfcc56be281d24f6a936f53"

RPROVIDES:${PN} += "kImageAnnotator-Qt5-0 \
libkImageAnnotator-Qt5-0 \
libkImageAnnotator-Qt5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkColorPicker-Qt5.so.0 \
libstdc++.so.6"

inherit rpm
