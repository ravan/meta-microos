SUMMARY = "Headers for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "pluma-devel-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "b5d8680c805db62bc554d41397ade80593eede85855780904ad553f1c1b1e75badca2335541ebed5a224fe6a16c09c5dccb11b92af61cd8e440d3f4812b1bd1e"

RPROVIDES:${PN} += "pkgconfig-pluma \
pluma-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gtksourceview-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pluma \
typelib-1-0-Pluma-1-0"

inherit rpm
