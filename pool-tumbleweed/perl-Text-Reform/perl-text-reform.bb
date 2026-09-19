SUMMARY = "Manual text wrapping and reformatting"
DESCRIPTION = "The module supplies a re-entrant, highly configurable replacement \
for the built-in Perl format() mechanism. \
 \
Author: \
------- \
        Damian Conway <damian@conway.org>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.20"

RPM_NAME = "perl-Text-Reform-1.20-24.40.noarch.rpm"
RPM_HASH = "1ef9daa70ee2b7b73646fd4484162e1d5b4594a2c673cb4a84352d1a8e720bd221376f5989a3e162406ded6c83a18880af702f38ff3c870440ca75d933a461bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Reform \
perl-Text-Reform"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Exporter"

inherit rpm
