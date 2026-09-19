SUMMARY = "Check the compiler's availability"
DESCRIPTION = "Devel::CheckCompiler is checker for compiler's availability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Devel-CheckCompiler-0.07-1.37.noarch.rpm"
RPM_HASH = "d672aee590005dd1c1237bb651ede40db13b45f484ee9d0fa4f10b298850f8405e2a709fd1fc137dc5ef5c24a1317ad9d0c61beb8a644353a99de7e94518563b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--AssertC99 \
perl-Devel--CheckCompiler \
perl-Devel-CheckCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
