SUMMARY = "C++ Binding for the ATK library -- Development Files"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort. \
 \
This package provides all the necessary files for development with ATK \
library's C++ bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "2.36.4"

RPM_NAME = "atkmm-devel-2.36.4-1.3.aarch64.rpm"
RPM_HASH = "125efbd96cbc064fd2474af9fe535ca6e029e48feeda01b5e9c66cfeede57e1d5b8ca66193249e99e61a32bbd822e573731b7ae75ef97f49ab6a224345d726fc"

RPROVIDES:${PN} += "atkmm-devel \
pkgconfig-atkmm-2.36"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatkmm-2-36-1 \
pkgconfig-atk \
pkgconfig-glibmm-2.68"

inherit rpm
