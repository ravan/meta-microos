SUMMARY = "Check That a Command Is Available"
DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular command \
is available."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Devel-CheckBin-0.04-1.42.noarch.rpm"
RPM_HASH = "6afcab1faa10be5dd951c9e86b464ae8bcba64dfa357d109dea1f6ed7c435a6aec76492642fc11c305d97c81e9377886bb34698e67ae2c5c85575a7e9bb00502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--CheckBin \
perl-Devel-CheckBin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--MakeMaker \
perl-parent"

inherit rpm
