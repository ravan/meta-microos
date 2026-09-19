SUMMARY = "Documentation for texlive-newpx"
DESCRIPTION = "This package includes the documentation for texlive-newpx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.551svn77682"

RPM_NAME = "texlive-newpx-doc-2026.226.1.551svn77682-61.2.noarch.rpm"
RPM_HASH = "df2fc400957a23278c61eb870164d9a852314334102ed20ada9fef53d146127e55b95db358d341daf10780174acb50cf7b6a9e6787ea6de561fa5393c848a2b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
