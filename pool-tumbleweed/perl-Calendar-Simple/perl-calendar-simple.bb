SUMMARY = "Perl extension to create simple calendars"
DESCRIPTION = "A very simple module that exports one function called 'calendar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.1.0"

RPM_NAME = "perl-Calendar-Simple-2.1.0-1.12.noarch.rpm"
RPM_HASH = "61c7f0ba55ef2168c1d9d18709eb5d15d7c774dea0dd7f143992cb272077359d4207ed2fe643e2ab93c812a159cb4807ad9127f1767164143cfb85abddc3363d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Calendar--Simple \
perl-Calendar-Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
