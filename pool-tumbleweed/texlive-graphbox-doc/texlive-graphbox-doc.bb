SUMMARY = "Documentation for texlive-graphbox"
DESCRIPTION = "This package includes the documentation for texlive-graphbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn77682"

RPM_NAME = "texlive-graphbox-doc-2026.226.1.1.1svn77682-60.4.noarch.rpm"
RPM_HASH = "714a1374115ecf48f56e4559e04dbf45cc50578d31a05848f9c5b399c4fa82c81cea87443926cf04c2bd280c8d8d9fb9aded6fd91bb67e92c283bb95a14f0b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
