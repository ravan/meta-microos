SUMMARY = "Documentation for texlive-precattl"
DESCRIPTION = "This package includes the documentation for texlive-precattl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.0svn76924"

RPM_NAME = "texlive-precattl-doc-2026.226.0.0.0.0svn76924-59.2.noarch.rpm"
RPM_HASH = "8de2b8f62b27c9ae3e9ba009de00b8de368f1f433155106bb43972e0481a71dfc146278f279c0acc0b7de8d9a294fbf88671d8b1e76b28472124b89f2bf2ffe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-precattl-doc"

RDEPENDS:${PN} += ""

inherit rpm
