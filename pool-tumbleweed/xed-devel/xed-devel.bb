SUMMARY = "Development files for Xed, a text editor"
DESCRIPTION = "xed is a text editor designed for the Cinnamon desktop. It has most \
standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, printing and editing of multiple \
documents in one window. \
 \
xed is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.9"

RPM_NAME = "xed-devel-3.8.9-1.3.aarch64.rpm"
RPM_HASH = "446549f3cec2fed8ff712b886dc6eb8344c0dbccb0d8d2ca5fbf08849247365943a2ac0a92cf53d10634a505bd174ab4213a097f20c3bc30d29b4d2d9e1948bb"

RPROVIDES:${PN} += "pkgconfig-xed \
xed-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtksourceview-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-libxml-2.0 \
pkgconfig-x11 \
pkgconfig-xapp \
xed"

inherit rpm
