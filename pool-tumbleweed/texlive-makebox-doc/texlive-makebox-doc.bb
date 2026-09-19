SUMMARY = "Documentation for texlive-makebox"
DESCRIPTION = "This package includes the documentation for texlive-makebox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-makebox-doc-2026.226.0.0.1svn77682-59.2.noarch.rpm"
RPM_HASH = "1b0c9e6c46287abe849f1e38b0e54cca6244d79efbc5a0c2bdbc34aa104437d1be5e27ce7afe98c9222df195ea9e26b96a5c7203b5e5459a474ab1c097cce3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
