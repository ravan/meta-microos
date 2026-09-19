SUMMARY = "Temporarily set Config or XSConfig values"
DESCRIPTION = "temporarily set Config or XSConfig values"
LICENSE = "Artistic-2.0"

PV = "0.50.0"

RPM_NAME = "perl-Mock-Config-0.50.0-1.5.noarch.rpm"
RPM_HASH = "e272521eaed51c8e4f901db5143786373115abe8fe56813147f8de90d1e6bb0ce8c377d2e32581adfe69d55c9a14daf04e266837b0139755ed1c380fbdd015ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mock--Config \
perl-Mock-Config"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
