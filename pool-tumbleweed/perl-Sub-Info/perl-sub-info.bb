SUMMARY = "Tool for inspecting subroutines"
DESCRIPTION = "Tool to inspect subroutines."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.002"

RPM_NAME = "perl-Sub-Info-0.002-1.39.noarch.rpm"
RPM_HASH = "639c802be5404a83201774f20297a8b4b84f8ff8567c26e1c08dbca629183aa70aeb4676ebc3bc7b9299ce4eb824bdefc958a52e31cd98f034c522d412f98f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Info \
perl-Sub-Info"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Importer"

inherit rpm
