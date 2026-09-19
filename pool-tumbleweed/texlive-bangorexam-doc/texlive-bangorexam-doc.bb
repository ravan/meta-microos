SUMMARY = "Documentation for texlive-bangorexam"
DESCRIPTION = "This package includes the documentation for texlive-bangorexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn76924"

RPM_NAME = "texlive-bangorexam-doc-2026.226.1.6.0svn76924-60.2.noarch.rpm"
RPM_HASH = "956c00140b91e198f364c3872febe5904dfe6ea0a448da8ccbe0c1ccae011a7b7f9791c9ad995f74bf13b6dc7498a738b64a47365efa0829d515710cc4440ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
