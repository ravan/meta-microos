SUMMARY = "Development files for libxklavier"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier-devel-5.4-2.11.aarch64.rpm"
RPM_HASH = "1c99d62418f16947c56d97a24b65e10276f2888926013baa12c5ec8fdc231bde298185b2963df542cc29fd198fb7efb44abbe38b643bb30764dd11a77e97c587"

RPROVIDES:${PN} += "libxklavier-devel \
pkgconfig-libxklavier"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libxklavier \
libxklavier16 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Xkl-1-0"

inherit rpm
