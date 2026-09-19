SUMMARY = "Greek serif/sans-serif fonts"
DESCRIPTION = "The MgOpen typefaces contain glyphs for viewing texts in Greek \
(written in the monotoniko system). \
 \
The package contains a serif typeface and two sans-serif ones, based \
on the designs of Times Roman, Optima and Helvetica, respectively."
LICENSE = "SUSE-MgOpen"

PV = "0.20050518"

RPM_NAME = "mgopen-fonts-0.20050518-206.3.noarch.rpm"
RPM_HASH = "13852a8d1500f6a6644c5d8ef0ad828787dd120a0dc960185cbdb0dcaee84284ff2d0323f7387a27d5ed8120794fc2bdd813f3d39459adf5dacc6abe57d010f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mgopen-fonts \
scalable-font-el"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
