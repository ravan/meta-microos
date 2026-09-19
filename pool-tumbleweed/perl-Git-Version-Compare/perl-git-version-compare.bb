SUMMARY = "Functions to compare Git versions"
DESCRIPTION = "Git::Version::Compare contains a selection of subroutines that make dealing \
with Git-related things (like versions) a little bit easier. \
 \
The strings to compare can be version numbers, tags from 'git.git' or the \
output of 'git version' or 'git describe'. \
 \
These routines collect the knowledge about Git versions that was \
accumulated while developing Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5.0"

RPM_NAME = "perl-Git-Version-Compare-1.5.0-1.7.noarch.rpm"
RPM_HASH = "f06f61041a67e913be0050246a9e8860f96ecd288f1f0a87e75e55d6e61e83b32e2b281a850ef99140d42e0c20980c90a9384ee2cf78dab346437ae1d6460fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Version--Compare \
perl-Git-Version-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
