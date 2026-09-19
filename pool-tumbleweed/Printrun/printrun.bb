SUMMARY = "RepRap printer interface and tools"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
It consists of printcore (dumb G-code sender), pronsole (featured command line \
G-code sender), pronterface (featured G-code sender with graphical user \
interface), and a small collection of helpful scripts. Together with skeinforge \
they form a pretty powerful softwarecombo. This package installs whole Printrun."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0+73"

RPM_NAME = "Printrun-2.2.0+73-1.6.aarch64.rpm"
RPM_HASH = "e6f799b026c002dc99ff4c87ae7e2ca815e57793a2d4664f0967ccd9b49a708d5050e872653b7b0c7aaaef090cd646f9563563b08396200757d451ff077ef572"

RPROVIDES:${PN} += "Printrun"

RDEPENDS:${PN} += "plater \
pronsole \
pronterface"

inherit rpm
