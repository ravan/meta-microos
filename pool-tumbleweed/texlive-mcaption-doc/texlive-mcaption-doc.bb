SUMMARY = "Documentation for texlive-mcaption"
DESCRIPTION = "This package includes the documentation for texlive-mcaption"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-mcaption-doc-2026.226.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "f3755751eca16fa32dcafcac19abdaaae23468cb2ccf54b4f3ea49ac81feeab9955252a0d721e40d56206821ca89fab2e17f9ea02d02b1ce31953ee85efd1a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mcaption-doc"

RDEPENDS:${PN} += ""

inherit rpm
