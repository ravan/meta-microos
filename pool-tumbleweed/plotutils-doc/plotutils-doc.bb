SUMMARY = "GNU Plotting Utilities"
DESCRIPTION = "The GNU plotting utilities consist of seven command line programs: the \
graphics programs `graph', `plot', `tek2plot', and `plotfont', and the \
mathematical programs `spline', `ode', and `double'.  GNU `libplot' is \
distributed with these programs; it is the library on which the \
graphics programs are based. `Libplot' is a function library for \
device-independent two-dimensional vector graphics, including vector \
graphics animations under the X Window System."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "plotutils-doc-2.6-31.7.noarch.rpm"
RPM_HASH = "9959b86ee8b0d87b4ea36696f2ea64e4ce159338a4fecf72dfadc1b9fb3c9619a59f8ac3cc833437d1a50ed09e536f60a555ec7ada7e92a9e8e0887b7ad37ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plotutils-/usr/share/doc/packages/plotutils/README \
plotutils-doc"

RDEPENDS:${PN} += "plotutils"

inherit rpm
