SUMMARY = "Documentation for texlive-avremu"
DESCRIPTION = "This package includes the documentation for texlive-avremu"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn71991"

RPM_NAME = "texlive-avremu-doc-2026.226.0.0.1svn71991-60.2.noarch.rpm"
RPM_HASH = "721e56df355ad826c54c7a5baa0e30ef09ec3c5ab1ad3cab81e72c09b5cab40a1cf49f6c7a2765957437a5241cee3386ac34010cca560841a52d8cc237f3a5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-avremu-doc"

RDEPENDS:${PN} += ""

inherit rpm
