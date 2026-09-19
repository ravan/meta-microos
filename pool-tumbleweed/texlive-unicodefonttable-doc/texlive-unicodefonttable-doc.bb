SUMMARY = "Documentation for texlive-unicodefonttable"
DESCRIPTION = "This package includes the documentation for texlive-unicodefonttable"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0ksvn77682"

RPM_NAME = "texlive-unicodefonttable-doc-2026.226.1.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "ea7a05bec55d826930846b416e5c058dc43888f3b720f2f6a3226186e92d8098fda5d126810038cf885eb33944e178e0192cf9807ce875edfdf63de653a3c950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicodefonttable-doc"

RDEPENDS:${PN} += ""

inherit rpm
