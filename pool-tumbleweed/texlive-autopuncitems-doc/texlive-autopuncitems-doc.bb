SUMMARY = "Documentation for texlive-autopuncitems"
DESCRIPTION = "This package includes the documentation for texlive-autopuncitems"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63045"

RPM_NAME = "texlive-autopuncitems-doc-2026.226.svn63045-60.2.noarch.rpm"
RPM_HASH = "47a4138757b8d87375fe1e63b759fadfad413577e808103fd398b2e9e7b29e8fa8d676574b91e31ce0cfc1a7739b3ab20fc1ba385bf2aa7a61a5f4c1348ee6b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopuncitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
