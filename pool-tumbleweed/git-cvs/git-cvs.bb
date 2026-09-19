SUMMARY = "Git tools for importing CVS repositories"
DESCRIPTION = "Tools for importing CVS repositories to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "git-cvs-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "723cee00747fd5240d55b7e15500257a9153253095ff6328143a791ddbdac9b154f457e18ea46974c435641f90bb7516ad84a54c9f22905b33a9f7d1b2507eca"

RPROVIDES:${PN} += "git-cvs"

RDEPENDS:${PN} += "/usr/bin/perl \
cvs \
cvsps \
git-core \
perl-DBD-SQLite \
perl-Git"

inherit rpm
