SUMMARY = "Documentation for texlive-xstix2"
DESCRIPTION = "This package includes the documentation for texlive-xstix2"
LICENSE = "LPPL-1.0"

PV = "2026.226.20260301svn78229"

RPM_NAME = "texlive-xstix2-doc-2026.226.20260301svn78229-59.4.noarch.rpm"
RPM_HASH = "84510dc3d3a5ced0165ad628fb8facf5971377bb6b2fa0ff3b6e906b87d73f6bc44eee8101fa394d6342e5e322cd6a2d24ff243b2b2138b0081754582a1a03ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xstix2-doc"

RDEPENDS:${PN} += ""

inherit rpm
