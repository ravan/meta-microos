SUMMARY = "Development files for wxWidgets-3_2"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains all files needed for developing with wxWidgets-3_2. \
 \
 \
Note: wxWidgets variant devel packages are mutually exclusive. Please \
read /usr/share/doc/packages/wxWidgets-3_2/README.SUSE to pick a correct variant."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.8"

RPM_NAME = "wxWidgets-3_2-devel-3.2.8-4.6.aarch64.rpm"
RPM_HASH = "16daddc76366af9f24724168f2b0f31af523b7b0c62d0f71414435a5bfcdcd95b930a8b1cb05ea7ae1ce82b7655d5b2006e9b22b4a6ea34b06cbd385cbb7d844"

RPROVIDES:${PN} += "wxGTK-devel \
wxGTK2-devel \
wxWidgets-3-2-devel \
wxWidgets-any-devel \
wxWidgets-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-base-suse-devel \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk2u-adv-suse16-0-0 \
libwx-gtk2u-aui-suse16-0-0 \
libwx-gtk2u-core-suse16-0-0 \
libwx-gtk2u-gl-suse16-0-0 \
libwx-gtk2u-html-suse16-0-0 \
libwx-gtk2u-media-suse16-0-0 \
libwx-gtk2u-propgrid-suse16-0-0 \
libwx-gtk2u-qa-suse16-0-0 \
libwx-gtk2u-ribbon-suse16-0-0 \
libwx-gtk2u-richtext-suse16-0-0 \
libwx-gtk2u-stc-suse16-0-0 \
libwx-gtk2u-xrc-suse16-0-0 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
