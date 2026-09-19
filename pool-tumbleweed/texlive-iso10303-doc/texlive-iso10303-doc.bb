SUMMARY = "Documentation for texlive-iso10303"
DESCRIPTION = "This package includes the documentation for texlive-iso10303"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn15878"

RPM_NAME = "texlive-iso10303-doc-2026.226.1.5svn15878-63.2.noarch.rpm"
RPM_HASH = "866ab5e09ac3a5550a1dddfca0679934c882314cf74ddea1e7e12eaae6d19c36808a61374d734a679ed4630c0181cf0404405623a483db7519c4803cffd8731c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso10303-doc"

RDEPENDS:${PN} += ""

inherit rpm
