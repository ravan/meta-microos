SUMMARY = "Development files for wxWidgets-3_2-nostl"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2-nostl. \
This variant of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API. \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2-nostl/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxWidgets-3_2-nostl-devel-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "a5389a8c41e1ef3806586b2589655ce3cc1d88ce5e2ef9859380a44fd8228e544ab06fb47a2cf5fd35bdff27ea752cd992730a591cb544863bfa4d4c4db21a51"

RPROVIDES:${PN} += "wxWidgets-3-2-nostl-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-nostl-devel \
libwx-baseu-suse-nostl.so.16.0.0 \
libwx-baseu-xml-suse-nostl.so.16.0.0 \
libwx-gtk3u-adv-suse-nostl16-0-0 \
libwx-gtk3u-aui-suse-nostl16-0-0 \
libwx-gtk3u-core-suse-nostl16-0-0 \
libwx-gtk3u-gl-suse-nostl16-0-0 \
libwx-gtk3u-html-suse-nostl16-0-0 \
libwx-gtk3u-media-suse-nostl16-0-0 \
libwx-gtk3u-propgrid-suse-nostl16-0-0 \
libwx-gtk3u-qa-suse-nostl16-0-0 \
libwx-gtk3u-ribbon-suse-nostl16-0-0 \
libwx-gtk3u-richtext-suse-nostl16-0-0 \
libwx-gtk3u-stc-suse-nostl16-0-0 \
libwx-gtk3u-xrc-suse-nostl16-0-0 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0"

inherit rpm
