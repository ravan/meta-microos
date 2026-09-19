SUMMARY = "B::COW additional B helpers to check COW status"
DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.7.0"

RPM_NAME = "perl-B-COW-0.7.0-1.8.aarch64.rpm"
RPM_HASH = "74b990d5390f72f596bcf384399519369c2e4a3e98d8de24ebf3793333ecbc909977fce298a99a9cb21da6f6adfd9835a87dfccd575a7f7bbece852de5fd3256"

RPROVIDES:${PN} += "perl-B--COW \
perl-B-COW"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
