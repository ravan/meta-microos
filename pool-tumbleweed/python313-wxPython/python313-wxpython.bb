SUMMARY = "The 'Phoenix' variant of the wxWidgets Python bindings"
DESCRIPTION = "Phoenix is a reimplementation of wxPython. Like the 'classic' \
wxPython, Phoenix wraps the wxWidgets C++ toolkit and provides access \
to the user interface portions of the wxWidgets API, enabling Python \
applications to have a GUI on Windows, macOS or Unix-like systems, \
with a native look and feel and requiring very little (if any) \
platform specific code."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.5"

RPM_NAME = "python313-wxPython-4.2.5-1.2.aarch64.rpm"
RPM_HASH = "488b4bcf3d3c9350024428afb144187438f8143c4cf497761b52c21faebf7aa75b0dd9fb3ed0c35df239bcdef1aecd6ed1c3f2304c427812018a0ca56cce28b1"

RPROVIDES:${PN} += "python3-wxPython \
python3-wxWidgets \
python3.13dist-wxpython \
python313-wxPython \
python313-wxWidgets \
python3dist-wxpython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
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
python313-Pillow \
python313-numpy \
update-alternatives"

inherit rpm
