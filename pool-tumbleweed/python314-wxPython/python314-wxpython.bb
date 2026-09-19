SUMMARY = "The 'Phoenix' variant of the wxWidgets Python bindings"
DESCRIPTION = "Phoenix is a reimplementation of wxPython. Like the 'classic' \
wxPython, Phoenix wraps the wxWidgets C++ toolkit and provides access \
to the user interface portions of the wxWidgets API, enabling Python \
applications to have a GUI on Windows, macOS or Unix-like systems, \
with a native look and feel and requiring very little (if any) \
platform specific code."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.5"

RPM_NAME = "python314-wxPython-4.2.5-1.2.aarch64.rpm"
RPM_HASH = "fde78eb908dc64e1c67c907b002ab038718d14c199ca1477aff53125ead1b75505cf36322ed49885e99afa93bb9443137e0920b46ffff789984c85cfc2fa70e0"

RPROVIDES:${PN} += "python3.14dist-wxpython \
python314-wxPython \
python314-wxWidgets \
python3dist-wxpython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-media-suse.so.16.0.0 \
libwx-gtk3u-propgrid-suse.so.16.0.0 \
libwx-gtk3u-ribbon-suse.so.16.0.0 \
libwx-gtk3u-richtext-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse.so.16.0.0 \
python-abi \
python314-Pillow \
python314-numpy \
update-alternatives"

inherit rpm
