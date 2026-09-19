SUMMARY = "OO interface for testing low-level Plack/PSGI apps"
DESCRIPTION = "OO interface for testing low-level Plack/PSGI apps"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.600.0"

RPM_NAME = "perl-Plack-Test-Agent-1.600.0-1.7.noarch.rpm"
RPM_HASH = "fa78d86154b50621dabc4cf23a4e4dd8cd443e0e374043887e991b448e98d8b159825512aa34973f68bd5f0dffdd9b5c06b5a00a5665c761b83237bd74e99f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Test--Agent \
perl-Plack-Test-Agent \
perl-Test--WWW--Mechanize--Bound"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTTP--Cookies \
perl-HTTP--Message--PSGI \
perl-HTTP--Request--Common \
perl-HTTP--Response \
perl-Plack--Loader \
perl-Plack--Util--Accessor \
perl-Test--TCP \
perl-Test--WWW--Mechanize \
perl-parent"

inherit rpm
