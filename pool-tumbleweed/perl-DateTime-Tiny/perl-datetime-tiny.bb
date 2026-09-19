SUMMARY = "Date object, with as little code as possible"
DESCRIPTION = "*DateTime::Tiny* is a most prominent member of the DateTime::Tiny suite of \
time modules. \
 \
It implements an extremely lightweight object that represents a datetime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.80.0"

RPM_NAME = "perl-DateTime-Tiny-1.80.0-1.7.noarch.rpm"
RPM_HASH = "17fb708505377f267f3a133dfed547fa99ccf932bbfe2bffa14c6bc02f1dd0e30a0fb7ca0998caa772fbe54fe3dc98f628ce42a50a1706b94e5f32e013b944bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Tiny \
perl-DateTime-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
