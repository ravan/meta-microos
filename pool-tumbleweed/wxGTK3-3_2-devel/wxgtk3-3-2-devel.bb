SUMMARY = "Development files for wxGTK3-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxGTK3-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxGTK3-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxGTK3-3_2-devel-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "01c7c7515fff5a0e6d0a76aa8f1792128becccf18b60a98cc8c443dc0997f1e9d37b3434519e231f71a07eeea69f4ad654f2833bb469ca6df4142ffcf8cbda22"

RPROVIDES:${PN} += "wxGTK3-3-2-devel \
wxGTK3-devel \
wxWidgets-any-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-devel \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-adv-suse16-0-0 \
libwx-gtk3u-aui-suse16-0-0 \
libwx-gtk3u-core-suse16-0-0 \
libwx-gtk3u-gl-suse16-0-0 \
libwx-gtk3u-html-suse16-0-0 \
libwx-gtk3u-media-suse16-0-0 \
libwx-gtk3u-propgrid-suse16-0-0 \
libwx-gtk3u-qa-suse16-0-0 \
libwx-gtk3u-ribbon-suse16-0-0 \
libwx-gtk3u-richtext-suse16-0-0 \
libwx-gtk3u-stc-suse16-0-0 \
libwx-gtk3u-webview-suse16-0-0 \
libwx-gtk3u-xrc-suse16-0-0 \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-gtk+-3.0"

inherit rpm
