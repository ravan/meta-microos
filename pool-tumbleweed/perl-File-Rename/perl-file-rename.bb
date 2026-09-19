SUMMARY = "Perl extension for renaming multiple files"
DESCRIPTION = "Perl extension for renaming multiple files"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.20.0"

RPM_NAME = "perl-File-Rename-2.20.0-2.12.noarch.rpm"
RPM_HASH = "5bfa6c32e2e05fe630417e8ac52140ea80d27256fe9b0e1bd07f18d9c7e636e5de908cabdc50826650513370ef5fe7242b4b1360234be8c751d2308aa32a3897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rename \
perl-File--Rename--Options \
perl-File--Rename--Unicode \
perl-File-Rename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
