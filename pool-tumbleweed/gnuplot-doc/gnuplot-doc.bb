SUMMARY = "Documentation of GNUplot"
DESCRIPTION = "GNUplot is a command line driven interactive function plotting utility. \
GNUplot supports many different types of terminals, plotters, and \
printers (including many color devices and pseudodevices like LaTeX) \
and can easily be extended to include new devices. \
 \
 \
gnuplot documentation files including the info pages."
LICENSE = "GPL-2.0-or-later & SUSE-Gnuplot"

PV = "6.0.4"

RPM_NAME = "gnuplot-doc-6.0.4-1.5.noarch.rpm"
RPM_HASH = "c885ab0eb7e0e6ace8fe227589777afeb8989c5893a2da6702c45228b3dba6cc9d857b9306848acfa46fec268f74b34f493b9719c633753aab9272f6a56be910"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuplot-doc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot"

inherit rpm
