SUMMARY = "Documentation for texlive-lps"
DESCRIPTION = "This package includes the documentation for texlive-lps"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn21322"

RPM_NAME = "texlive-lps-doc-2026.226.0.0.7svn21322-61.2.noarch.rpm"
RPM_HASH = "6db6c1900d0d5bee5ea2e663468d70a9bdd18a171309e8ea8324e8cc849c8669d89e3d1afd3c9ccf5981b46b5f46ce92aa64181c8eeb6d75475817f5605a352f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lps-doc"

RDEPENDS:${PN} += ""

inherit rpm
