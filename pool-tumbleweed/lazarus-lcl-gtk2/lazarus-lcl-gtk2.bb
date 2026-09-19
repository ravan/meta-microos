SUMMARY = "Lazarus Component Library - GTK2 widgetset support"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing applications \
using the GTK2 widgetset."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-gtk2-4.8-1.2.aarch64.rpm"
RPM_HASH = "0857682c3947727a322906ea676027a78126bf4daf05fb7f01238c98aaa1ce9af4d9d6bf0a8029da114e5f5095504a944f031bb16d81538742187e54c4a08ba4"

RPROVIDES:${PN} += "lazarus-lcl-gtk2"

RDEPENDS:${PN} += "gtk2-devel \
lazarus-lcl"

inherit rpm
