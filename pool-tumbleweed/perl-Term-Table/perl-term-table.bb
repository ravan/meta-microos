SUMMARY = "Format a header and rows into a table"
DESCRIPTION = "This is used by some failing tests to provide diagnostics about what has \
gone wrong. This module is able to format rows of data into tables."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.028"

RPM_NAME = "perl-Term-Table-0.028-1.5.noarch.rpm"
RPM_HASH = "2b4f86bd45f10fe2b46739b0bcf997ba1ac23d6c2437699bca944b476e9a2e362cff83818ddded3f0f0921569a167d6991dd9d11226ebebb5e9d2dac5502b1f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--Table \
perl-Term--Table--Cell \
perl-Term--Table--CellStack \
perl-Term--Table--HashBase \
perl-Term--Table--LineBreak \
perl-Term--Table--Spacer \
perl-Term--Table--Util \
perl-Term-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
