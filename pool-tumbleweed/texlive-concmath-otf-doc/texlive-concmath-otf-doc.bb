SUMMARY = "Documentation for texlive-concmath-otf"
DESCRIPTION = "This package includes the documentation for texlive-concmath-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.73svn78172"

RPM_NAME = "texlive-concmath-otf-doc-2026.226.0.0.73svn78172-60.2.noarch.rpm"
RPM_HASH = "97f238ed936fa9f2357f5ea5666485d6dc72b5cc8dda4be9524261c44673f95d58b98f233ef76999444be43af4d18ad88b5d20550e1389aa6aea1a362ea256a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
