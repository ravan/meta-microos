SUMMARY = "Documentation for texlive-datetime2"
DESCRIPTION = "This package includes the documentation for texlive-datetime2"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn77682"

RPM_NAME = "texlive-datetime2-doc-2026.226.1.5.7svn77682-61.2.noarch.rpm"
RPM_HASH = "014251dae16013bd50a54b35c0cac09e18ba857f6f9eee0300d1c550834c6f5602e35fdd6cd29564ad2bf38c13f8e0ecda7422a719d29b3bc4cb021e27b0a7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-doc"

RDEPENDS:${PN} += ""

inherit rpm
