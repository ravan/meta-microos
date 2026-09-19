SUMMARY = "Graphical User Interface for the maxima Computer Algebra System"
DESCRIPTION = "wxMaxima is a GUI for the computer algebra system maxima \
based on wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.0"

RPM_NAME = "wxMaxima-26.08.0-1.1.aarch64.rpm"
RPM_HASH = "e168a59260b29329e9beff67092548f40dbe89631d35c228133247054ced22076d806cb6027a181e5207a42edae7fbe2a3c6816e5dfb029249988dd730232052"

RPROVIDES:${PN} += "wxMaxima"

RDEPENDS:${PN} += "gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-qa-suse.so.16.0.0 \
libwx-gtk3u-richtext-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
maxima"

inherit rpm
