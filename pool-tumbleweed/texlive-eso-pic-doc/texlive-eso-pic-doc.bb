SUMMARY = "Documentation for texlive-eso-pic"
DESCRIPTION = "This package includes the documentation for texlive-eso-pic"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0dsvn77682"

RPM_NAME = "texlive-eso-pic-doc-2026.226.3.0dsvn77682-59.2.noarch.rpm"
RPM_HASH = "2795e7f61f5a0e4ecdd62a24a9adb3a79facf76c01293de71394bb768a9f8be6c156f2b9e432d6a66e48c329a3e502efd97fcfcd4467cbbf3a372b0d55efba8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eso-pic-doc"

RDEPENDS:${PN} += ""

inherit rpm
