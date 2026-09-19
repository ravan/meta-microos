SUMMARY = "Perl extension for managing templates, and performing variable interpolation"
DESCRIPTION = "Perl extension for managing templates, and performing variable interpolation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.90.0"

RPM_NAME = "perl-CGI-FastTemplate-1.90.0-1.7.noarch.rpm"
RPM_HASH = "c29381f7949d4d7f6ee3f3ccf86b604b1f476fe1c277754f6d1e4dc133882159b877440b915597ab3312eaaf0fa53a28ff72e6b69fe61e645b77f84b3bb08086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--FastTemplate \
perl-CGI-FastTemplate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
