SUMMARY = "Documentation for texlive-cora-macs"
DESCRIPTION = "This package includes the documentation for texlive-cora-macs"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76540"

RPM_NAME = "texlive-cora-macs-doc-2026.226.svn76540-61.2.noarch.rpm"
RPM_HASH = "19bf81c33d01578d015b1054876f255026224358cdb37bcd3ad835f3d4f136646745665fcd2d316f6b9956941c175ccab16c4d76596b73de2bf6141b552586f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cora-macs-doc"

RDEPENDS:${PN} += ""

inherit rpm
