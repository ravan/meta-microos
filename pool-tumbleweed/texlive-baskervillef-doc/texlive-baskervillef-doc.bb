SUMMARY = "Documentation for texlive-baskervillef"
DESCRIPTION = "This package includes the documentation for texlive-baskervillef"
LICENSE = "OFL-1.1"

PV = "2026.226.1.052svn77682"

RPM_NAME = "texlive-baskervillef-doc-2026.226.1.052svn77682-60.2.noarch.rpm"
RPM_HASH = "e0a0cccee079072f1097c4e1d79fdfe96338d967b66b0ecaceb18bf827efb7691a7d6fda917267661a6d40853503ea49a4283fd7ff02f2f53685e2db1ececfb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervillef-doc"

RDEPENDS:${PN} += ""

inherit rpm
