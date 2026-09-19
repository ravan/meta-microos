SUMMARY = "Alternative interface to File::Find"
DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you to \
build rules which specify the desired files and directories."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.350.0"

RPM_NAME = "perl-File-Find-Rule-0.350.0-1.7.noarch.rpm"
RPM_HASH = "aa99bbdddf8824b19dc875727b892a67bc95151689786a6f33c7879b8ded14d84d07a91080a78aab9fccf597f635045b5b05df0d1032b19893a1aea843399252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Find--Rule \
perl-File-Find-Rule"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Number--Compare \
perl-Text--Glob"

inherit rpm
