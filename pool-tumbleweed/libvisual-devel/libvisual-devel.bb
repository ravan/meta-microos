SUMMARY = "Headers for the libvisual sound visualization library"
DESCRIPTION = "Libvisual is a library that acts as a middle layer between applications \
that want audio visualisation and audio visualisation plugins. \
 \
This library is used by amaroK for example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "libvisual-devel-0.4.0-207.10.aarch64.rpm"
RPM_HASH = "452ea9b4c5e89922676b720b920b919f65f417021c3b4555708899e443b915a3e1afe15728ffb022311323a621dd624bae51ddb489098639dfffcfb03a8cbd25"

RPROVIDES:${PN} += "libvisual-devel \
pkgconfig-libvisual-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libvisual-0-4-0"

inherit rpm
