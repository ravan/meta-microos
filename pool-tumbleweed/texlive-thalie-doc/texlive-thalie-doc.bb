SUMMARY = "Documentation for texlive-thalie"
DESCRIPTION = "This package includes the documentation for texlive-thalie"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.13asvn65249"

RPM_NAME = "texlive-thalie-doc-2026.227.0.0.13asvn65249-62.2.noarch.rpm"
RPM_HASH = "db5db88810e642ee7fc129eb387bcfb3878682b1b7306d33d1407c37930789813fd22832eb505dc17220e4cee3f5d4bef4f84ef3800a4cef5866fdd8168a77a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thalie-doc"

RDEPENDS:${PN} += ""

inherit rpm
