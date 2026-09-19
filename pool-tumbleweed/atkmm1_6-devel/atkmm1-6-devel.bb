SUMMARY = "C++ Binding for the ATK library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.5"

RPM_NAME = "atkmm1_6-devel-2.28.5-1.3.aarch64.rpm"
RPM_HASH = "637da60ca091e4c6cfa6bb91fe8bb8f44e4f996931e21644d0427681107320b0ba6c1aef7fdedee7c95c93ec44181c27f082197fc176e05634d093fbc9389408"

RPROVIDES:${PN} += "atkmm1-6-devel \
pkgconfig-atkmm-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatkmm-1-6-1 \
pkgconfig-atk \
pkgconfig-glibmm-2.4"

inherit rpm
