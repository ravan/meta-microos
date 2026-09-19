SUMMARY = "shift and scale time"
DESCRIPTION = "shift and scale time"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0.2"

RPM_NAME = "perl-Time-Mock-0.0.2-1.41.noarch.rpm"
RPM_HASH = "8da1f0da0377e3cdf6b5374c9159acd5094589ff454380befd0eb85df832dc0a4244c1ee7018b42dacf38466149c2608b03de790c51f386a5248089bbe5ab901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Mock \
perl-Time--Mock--Original \
perl-Time-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
