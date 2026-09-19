SUMMARY = "Create a minimal mirror of CPAN"
DESCRIPTION = "CPAN::Mini provides a simple mechanism to build and update a minimal mirror \
of the CPAN on your local disk. It contains only those files needed to \
install the newest version of every distribution. Those files are: \
 \
  * 01mailrc.txt.gz \
 \
  * 02packages.details.txt.gz \
 \
  * 03modlist.data.gz \
 \
  * the last non-developer release of every dist for every author"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.111.17"

RPM_NAME = "perl-CPAN-Mini-1.111.17-1.7.noarch.rpm"
RPM_HASH = "b3b3229063d6c09bb7f348ce9b4217d62ab8ffe4c04b2bf753d2234e42604c859d852357cc5d6e726d8700b032b9548191cf886d8e799b60f9facfffbbeec3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Mini \
perl-CPAN--Mini--App \
perl-CPAN-Mini"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Zlib \
perl-File--HomeDir \
perl-File--Path \
perl-LWP--UserAgent \
perl-URI"

inherit rpm
