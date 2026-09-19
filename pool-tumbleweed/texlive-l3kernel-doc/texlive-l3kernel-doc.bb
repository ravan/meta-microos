SUMMARY = "Documentation for texlive-l3kernel"
DESCRIPTION = "This package includes the documentation for texlive-l3kernel"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77438"

RPM_NAME = "texlive-l3kernel-doc-2026.226.svn77438-63.2.noarch.rpm"
RPM_HASH = "785d2a57ad484488a03ca1417ff3a9dea4ac8225e3ef8c91f3e9390598f6c0b6cb89092ee16d3b9d802bbdd808f0e2b48983bae5d9e08ff219868774330b4eca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3kernel-doc"

RDEPENDS:${PN} += ""

inherit rpm
