SUMMARY = "3d extension for perl-GDGraph"
DESCRIPTION = "This is the GD::Graph3d extensions module. It provides 3D graphs for \
the GD::Graph module by Martien Verbruggen, which in turn generates \
graph using Lincoln Stein's GD.pm."
LICENSE = "Artistic-1.0"

PV = "0.63"

RPM_NAME = "perl-GD-Graph3d-0.63-273.12.aarch64.rpm"
RPM_HASH = "5e225a27e969dc3f17a8421029a2a1ab4c361a718b78f951777146019696bf193c4ab19e2bb019d07e35f67b098f1b2deed6a4abf96c4185fe1db45d58421f11"

RPROVIDES:${PN} += "perl-GD--Graph--axestype3d \
perl-GD--Graph--bars3d \
perl-GD--Graph--cylinder \
perl-GD--Graph--cylinder3d \
perl-GD--Graph--lines3d \
perl-GD--Graph--pie3d \
perl-GD--Graph3d \
perl-GD-Graph3d \
perl-GDGraph3d"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-GD \
perl-GDGraph \
perl-GDTextUtil"

inherit rpm
