SUMMARY = "Documentation for texlive-changelog"
DESCRIPTION = "This package includes the documentation for texlive-changelog"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.1svn77682"

RPM_NAME = "texlive-changelog-doc-2026.226.2.6.1svn77682-59.2.noarch.rpm"
RPM_HASH = "acc3bdf2f9fa6d4cd5491ad8b2bdea81c8ce7a9b5b2911aa7deb33d5f7cfd2b132c12ff228c3f97b73d625f04f63b04708a7955a469fac99447a39061ae82a1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelog-doc"

RDEPENDS:${PN} += ""

inherit rpm
