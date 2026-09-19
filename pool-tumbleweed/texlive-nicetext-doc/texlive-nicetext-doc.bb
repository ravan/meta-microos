SUMMARY = "Documentation for texlive-nicetext"
DESCRIPTION = "This package includes the documentation for texlive-nicetext"
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.67svn38914"

RPM_NAME = "texlive-nicetext-doc-2026.226.r0.67svn38914-61.2.noarch.rpm"
RPM_HASH = "508871694cda857883b25d6efbc9affe62b58aca280f271037656063345e0588726897d964d16fda2024c164e75b8729906641595c5aa694d0f64a271640fa98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
