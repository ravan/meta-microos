SUMMARY = "Combines List::Util, List::SomeUtils and List::UtilsBy in one bite-sized[cut]"
DESCRIPTION = "Are you sick of trying to remember whether a particular helper is defined \
in List::Util, List::SomeUtils or List::UtilsBy? I sure am. Now you don't \
have to remember. This module will export all of the functions that either \
of those three modules defines. \
 \
Note that all function documentation has been shamelessly copied from \
List::Util, List::SomeUtils and List::UtilsBy."
LICENSE = "Artistic-2.0"

PV = "0.19"

RPM_NAME = "perl-List-AllUtils-0.19-1.25.noarch.rpm"
RPM_HASH = "3689c4da5a7e38fa4ae6f9dbb1dbfbf74dc0796f31675d2e07d1fa01dd083274e5fe168bbbe4212c1ac7c4ad0972f18eb51a4be2d26337f0a4a88ba501cd85cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--AllUtils \
perl-List-AllUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-List--SomeUtils \
perl-List--Util \
perl-List--UtilsBy"

inherit rpm
