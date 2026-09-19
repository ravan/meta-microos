SUMMARY = "Add a log() method to Git::Repository"
DESCRIPTION = "This module adds a new method to Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.314"

RPM_NAME = "perl-Git-Repository-Plugin-Log-1.314-1.29.noarch.rpm"
RPM_HASH = "39e62caa29bf60da3caf5e86369ec53e006a022f340f60ffb55c78a894d07aa62a1f9a3c0a9a7dadac38e3848cb5d6c2af77d9175661d17b759b5221f0e3034d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Repository--Log \
perl-Git--Repository--Log--Iterator \
perl-Git--Repository--Plugin--Log \
perl-Git-Repository-Plugin-Log"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Git--Repository \
perl-Git--Repository--Command \
perl-Git--Repository--Plugin"

inherit rpm
