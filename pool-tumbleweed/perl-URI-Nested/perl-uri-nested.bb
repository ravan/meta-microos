SUMMARY = "Nested URIs"
DESCRIPTION = "Nested URIs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-URI-Nested-0.10-1.38.noarch.rpm"
RPM_HASH = "cbeb559e5b5e719bd0851105570f604f78081f88810164be314f7617b03f359220e45b583105b1d238568a727f8bbf022e0d705e2e5064dd0fe04709b7933dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Nested \
perl-URI-Nested"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-URI"

inherit rpm
