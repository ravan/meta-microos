SUMMARY = "System user for the flatpak system helper"
DESCRIPTION = "System user for the flatpak system helper."
LICENSE = "LGPL-2.1-or-later"

PV = "1.18.2"

RPM_NAME = "system-user-flatpak-1.18.2-1.1.noarch.rpm"
RPM_HASH = "a2156c75df8d0192d6bd43de9ab2ab9ac85ffb43827f5877b63f76d3e578cf793dab3cc86689d7d14f7f0d11b335f63493f7929f83308079a0b2e80a8b7dd2e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-flatpak \
system-user-flatpak \
user-flatpak"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
