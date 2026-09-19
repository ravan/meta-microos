SUMMARY = "Documentation for texlive-dirtree"
DESCRIPTION = "This package includes the documentation for texlive-dirtree"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn77682"

RPM_NAME = "texlive-dirtree-doc-2026.226.0.0.32svn77682-59.2.noarch.rpm"
RPM_HASH = "ca729a35ad5317b25e92994c29a46cd64247c0332cda31de5a79154a35e4bda4d46e0f6e7d4c776ba7a6956599c36e3355df51c18224953d2c826ce0a8b36941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
