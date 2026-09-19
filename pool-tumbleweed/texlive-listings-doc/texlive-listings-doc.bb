SUMMARY = "Documentation for texlive-listings"
DESCRIPTION = "This package includes the documentation for texlive-listings"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.11bsvn77682"

RPM_NAME = "texlive-listings-doc-2026.226.1.11bsvn77682-61.2.noarch.rpm"
RPM_HASH = "ab55980500983271ae2ca656a8ab76ea6565a1bef69b4dad710423b2bc8820804691d1890a703b4683b4d0f155ae860206f6d6667dc23dbbc8a7b1857dc57921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-doc"

RDEPENDS:${PN} += ""

inherit rpm
