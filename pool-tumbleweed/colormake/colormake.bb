SUMMARY = "Colorize the make output"
DESCRIPTION = "A simple wrapper for making the output from make easier to read \
(more colorful), and errors easier to find in messy compilations. \
It was inspired by Micheal T. Babcock's excellent logcolorize program."
LICENSE = "GPL-2.0+"

PV = "0.9.20140503"

RPM_NAME = "colormake-0.9.20140503-4.12.noarch.rpm"
RPM_HASH = "568997e95cfd448b53c3d101d9df67cf41a52114b4f00d5671ddce23cc103e3f1cf52b62fa72edfd0f30503a0764e387c03119c4b6a432dc13e7ec5bdee89610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colormake"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
