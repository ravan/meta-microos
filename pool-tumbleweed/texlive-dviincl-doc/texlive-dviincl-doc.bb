SUMMARY = "Documentation for texlive-dviincl"
DESCRIPTION = "This package includes the documentation for texlive-dviincl"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.00svn29349"

RPM_NAME = "texlive-dviincl-doc-2026.226.1.00svn29349-61.4.noarch.rpm"
RPM_HASH = "e1e4ec6ff34bae7dd0fef75d7aa2d558aa26d83ace2ea92328231a9ace11619cdc251a72a90b6bd6f3477343e6e88a2737ee591552aec2336aba0053e35e96b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dviincl-doc-en;pl \
texlive-dviincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
