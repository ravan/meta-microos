SUMMARY = "Read multiple hunks of data out of your DATA section"
DESCRIPTION = "Data::Section provides an easy way to access multiple named chunks of \
line-oriented data in your module's DATA section. It was written to allow \
modules to store their own templates, but probably has other uses."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.200008"

RPM_NAME = "perl-Data-Section-0.200008-1.18.noarch.rpm"
RPM_HASH = "3dbd62e041e494b0651d4f3e04218fd3fe747c00167ea5df8fa629be53af3c518c469968f241c675e17d6d6ab4a66cf2203e35f3291a173523c1cadf59da9b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Section \
perl-Data-Section"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MRO--Compat \
perl-Sub--Exporter"

inherit rpm
