SUMMARY = "Documentation for texlive-roundrect"
DESCRIPTION = "This package includes the documentation for texlive-roundrect"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn39796"

RPM_NAME = "texlive-roundrect-doc-2026.226.2.2svn39796-60.2.noarch.rpm"
RPM_HASH = "2c2a7b3f638e72ab6c7435cb0d0a8b171d9c085c138696ec8aff5a0a66ee97a17842e6d346ce175474a101650f68790c8de6c3011f654599016b35dab9849531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect-doc"

RDEPENDS:${PN} += ""

inherit rpm
