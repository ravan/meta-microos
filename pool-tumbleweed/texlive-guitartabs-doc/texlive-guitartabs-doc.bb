SUMMARY = "Documentation for texlive-guitartabs"
DESCRIPTION = "This package includes the documentation for texlive-guitartabs"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48102"

RPM_NAME = "texlive-guitartabs-doc-2026.226.svn48102-60.4.noarch.rpm"
RPM_HASH = "80edda8f1e4fc6a2db6fd8a95f9d435164b4281bcf3c5842807d978679ccb656962aebcfd3f004c41cc9f51a1abd2c23e64ff05eaeacdf03e8c934bc62b23479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitartabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
