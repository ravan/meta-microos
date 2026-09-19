SUMMARY = "Check for POD errors in files"
DESCRIPTION = "Check POD files for errors or warnings in a test file, using 'Pod::Simple' \
to do the heavy lifting."
LICENSE = "Artistic-2.0 | GPL-2.0-only"

PV = "1.520.0"

RPM_NAME = "perl-Test-Pod-1.520.0-1.3.noarch.rpm"
RPM_HASH = "ee99ff089910dabd57ab3a7d90c34a382b41d5478c9290c8e103a8da80c35da14ff2151b8d59f3a7401046bdcd249a33efe46aaadcadb880757b6cf48f7a6eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Pod \
perl-Test-Pod"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Pod--Simple"

inherit rpm
