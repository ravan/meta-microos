SUMMARY = "International Tag Set for GTK+ 4"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 4"
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "gettext-its-gtk4-4.22.5-1.1.aarch64.rpm"
RPM_HASH = "c7408ad369e48bf9e36f0266263223a695f2bc8ff1f7c1c36878c11a8a0a2d199f5708b5878fd0d66e8eb124df6558dd8bb149be45cadc38c5ae2f7780504fb4"

RPROVIDES:${PN} += "gettext-its-gtk3 \
gettext-its-gtk4"

RDEPENDS:${PN} += ""

inherit rpm
