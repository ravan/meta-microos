SUMMARY = "Documentation for texlive-arydshln"
DESCRIPTION = "This package includes the documentation for texlive-arydshln"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.76svn77682"

RPM_NAME = "texlive-arydshln-doc-2026.226.1.76svn77682-60.2.noarch.rpm"
RPM_HASH = "fdc28399dd456f5dfb8e2f19a887853339d529302103cc584b69ff3c7fa8414253a1027d7179232c6f7f5ae129405d1524895b0f35cae471bdc5a6a15cb48c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arydshln-doc"

RDEPENDS:${PN} += ""

inherit rpm
