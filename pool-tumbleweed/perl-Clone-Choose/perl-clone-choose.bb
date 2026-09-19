SUMMARY = "Choose appropriate clone utility"
DESCRIPTION = "'Clone::Choose' checks several different modules which provides a 'clone()' \
function and selects an appropriate one. The default preference is \
 \
  Clone \
  Storable \
  Clone::PP \
 \
This list might evolve in future. Please see EXPORTS how to pick a \
particular one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-Clone-Choose-0.010-1.33.noarch.rpm"
RPM_HASH = "7fd2bf07bd736b62ce86fc7cc619ec0f1171f5bed69e04dff4bd8b691d12ce69af168d73f008cafbb2877bfcafb0e2b6b1362b190b766cf45774cba0401c1ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Clone--Choose \
perl-Clone-Choose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
