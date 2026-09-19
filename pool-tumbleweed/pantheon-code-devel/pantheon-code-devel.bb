SUMMARY = "Development Files for pantheon-code"
DESCRIPTION = "Extensible Text Editor for the Pantheon Desktop. \
 \
This package contains development files needed to develop plugins for \
for pantheon-code."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.2"

RPM_NAME = "pantheon-code-devel-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "9da1057ed22a2a284bc2ecf26883801afb091cd9f814012ef76dad730781b7897b2bc72a0422f4a7e21015dbe7109732c098d684ccc28fb713e399f837433127"

RPROVIDES:${PN} += "pantheon-code-devel \
pkgconfig-codecore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcodecore0 \
pkgconfig-fontconfig \
pkgconfig-gee-0.8 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-granite \
pkgconfig-gtk+-3.0 \
pkgconfig-gtksourceview-4 \
pkgconfig-libgit2-glib-1.0 \
pkgconfig-libhandy-1 \
pkgconfig-libpeas-2 \
pkgconfig-libvala-0.56 \
pkgconfig-pangoft2 \
pkgconfig-vte-2.91"

inherit rpm
