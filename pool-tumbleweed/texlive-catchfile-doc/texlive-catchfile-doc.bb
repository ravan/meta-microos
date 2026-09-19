SUMMARY = "Documentation for texlive-catchfile"
DESCRIPTION = "This package includes the documentation for texlive-catchfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-catchfile-doc-2026.226.1.8svn77682-59.2.noarch.rpm"
RPM_HASH = "160bd9c4b102dc49c80568c833f509df829bb67a3bae03d88e8de8cfefd1904db4eb76c8f1ffa0f55b36b6aa57e5bce88202498247cc68eb3c165547133b07f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
