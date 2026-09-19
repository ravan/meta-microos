SUMMARY = "Documentation for texlive-draftwatermark"
DESCRIPTION = "This package includes the documentation for texlive-draftwatermark"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.3svn77682"

RPM_NAME = "texlive-draftwatermark-doc-2026.226.3.3svn77682-59.2.noarch.rpm"
RPM_HASH = "e6f4c1ad492634c9d13b0fa6f1793294e0b30c0b495378390a193eae9140709a21eefe28679bf9198aaf51a787469dae8d4c306eb23931fffcd3e8f6cd5d138d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftwatermark-doc"

RDEPENDS:${PN} += ""

inherit rpm
