SUMMARY = "Text::SimpleTable::AutoWidth - Simple eyecandy ASCII tables with auto-wi[cut]"
DESCRIPTION = "Simple eyecandy ASCII tables with auto-selection columns width, as seen in \
Catalyst."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Text-SimpleTable-AutoWidth-0.09-1.26.noarch.rpm"
RPM_HASH = "0e523ae49c61ddca5a20e172bda76b7872c03a9fe852d9c6b116d39b7a34c8c9c7f81a2c79ec7f6ebf723caff10d5ad4d264a153ac546af7e3baa104c4464287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable--AutoWidth \
perl-Text-SimpleTable-AutoWidth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moo \
perl-Text--SimpleTable"

inherit rpm
