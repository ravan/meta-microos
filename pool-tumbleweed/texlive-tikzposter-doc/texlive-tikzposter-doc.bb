SUMMARY = "Documentation for texlive-tikzposter"
DESCRIPTION = "This package includes the documentation for texlive-tikzposter"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn32732"

RPM_NAME = "texlive-tikzposter-doc-2026.226.2.0svn32732-59.2.noarch.rpm"
RPM_HASH = "e24b31c4253d1ebb8adde94ee5b83d1c271e095a5bff495658d02773b49aa8ac46584dc05c4edebd4817503714b686a92bdc71fb814e3a099f42057e4d7cff89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
