SUMMARY = "Documentation for texlive-lineara"
DESCRIPTION = "This package includes the documentation for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63169"

RPM_NAME = "texlive-lineara-doc-2026.226.svn63169-61.2.noarch.rpm"
RPM_HASH = "f0067bd635f27801071225e828603329ae21421196a120106dbe314b3a96d786206210cb1bbebc5b662cfd63553c75059c0c267456f18b744a660bf0981c0800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lineara-doc"

RDEPENDS:${PN} += ""

inherit rpm
