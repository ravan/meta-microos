SUMMARY = "Introspect many-to-many relationships"
DESCRIPTION = "Because the many-to-many relationships are not real relationships, they can \
not be introspected with DBIx::Class. Many-to-many relationships are \
actually just a collection of convenience methods installed to bridge two \
relationships. This DBIx::Class component can be used to store all relevant \
information about these non-relationships so they can later be introspected \
and examined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1.2"

RPM_NAME = "perl-DBIx-Class-IntrospectableM2M-0.1.2-1.7.noarch.rpm"
RPM_HASH = "7fc7deed6417987c929ebb25062e2cb39c8aa3b8519d8cb1a94f0baf47fd445e3fe2c82c0feb002ec685eaa1a78c36bc58ed885e5eeca6b801ea8ce7f8ee10e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--IntrospectableM2M \
perl-DBIx-Class-IntrospectableM2M"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBIx--Class"

inherit rpm
