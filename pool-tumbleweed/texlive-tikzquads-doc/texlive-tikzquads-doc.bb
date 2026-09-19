SUMMARY = "Documentation for texlive-tikzquads"
DESCRIPTION = "This package includes the documentation for texlive-tikzquads"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77050"

RPM_NAME = "texlive-tikzquads-doc-2026.226.1.2asvn77050-59.2.noarch.rpm"
RPM_HASH = "c734560620cb2c8d53901b58d7abb4ebf5f7c0ff4307a0bb97d90c4a5ea0acabd51a23fb8d34b2a5aad499bcaee4942d21ec2a65e5cda9b2139edbd8669440d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzquads-doc"

RDEPENDS:${PN} += ""

inherit rpm
