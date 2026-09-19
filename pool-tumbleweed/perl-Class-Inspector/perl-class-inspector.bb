SUMMARY = "Get information about a class and its structure"
DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.360.0"

RPM_NAME = "perl-Class-Inspector-1.360.0-1.7.noarch.rpm"
RPM_HASH = "5cb070cf50c7ab94043a427f4cbbb109f68b3e896f8d37121f78265fec8f2988973deae77350577f178cc0786c298dd06891c2276306146628a878a66db6fae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Inspector \
perl-Class--Inspector--Functions \
perl-Class-Inspector"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
