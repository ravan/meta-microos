SUMMARY = "Tool to list orphaned RPM packages"
DESCRIPTION = "This program finds 'orphaned' packages on the system. It determines \
which packages have no other packages depending on their \
installation, and shows a list of these packages."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "rpmorphan-1.19-3.19.noarch.rpm"
RPM_HASH = "aff842ef3ff95a89a3c9ba67d7f00ba62ccc93db49ed698a03237b5c03f0a0d286335c12151d44b017fdeddabc7f8980f117a515b5cbc2f7123a3766998f40ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmorphan \
perl-Tk--CListbox \
perl-Tk--HButton \
perl-Tk--MLColumn \
perl-Tk--MListbox \
rpmorphan"

RDEPENDS:${PN} += "/usr/bin/perl \
rpm"

inherit rpm
