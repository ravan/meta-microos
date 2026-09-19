SUMMARY = "Lazarus Component Library - non-graphical components"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains LCL components for developing non-graphical applications \
and command-line tools."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1"

PV = "4.8"

RPM_NAME = "lazarus-lcl-nogui-4.8-1.2.aarch64.rpm"
RPM_HASH = "d466f9c530e80766495f1997e1578e1e41468666b96e64dc580474e3e03a7fc4c43824f1dfe7571728854d7bf218e5bc9480979bf11c17cdb276b8fe0b811af7"

RPROVIDES:${PN} += "lazarus-lcl-nogui"

RDEPENDS:${PN} += "lazarus-lcl"

inherit rpm
