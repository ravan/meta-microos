SUMMARY = "Documentation for texlive-codedescribe"
DESCRIPTION = "This package includes the documentation for texlive-codedescribe"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24asvn77814"

RPM_NAME = "texlive-codedescribe-doc-2026.226.1.24asvn77814-60.2.noarch.rpm"
RPM_HASH = "4fea8b2439885934fdbf62e3dd8ce5da5c92cb565bd5628c42b3af5f4aa23badff1f3d4c0a4a1188293bb111be18c5df53704bcebd98f9aadcc7aa5bf88f1c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codedescribe-doc"

RDEPENDS:${PN} += ""

inherit rpm
