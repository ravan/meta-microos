SUMMARY = "Documentation for texlive-askinclude"
DESCRIPTION = "This package includes the documentation for texlive-askinclude"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn77682"

RPM_NAME = "texlive-askinclude-doc-2026.226.2.7svn77682-60.2.noarch.rpm"
RPM_HASH = "2b7a53dccf70a142d77862e14e823876d186a6de5d61897158bebc6ed7655bb0082822a061125f32d06c0e4e5bac1a25bb417ea822aa5648e5eddd593f6a8ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askinclude-doc"

RDEPENDS:${PN} += ""

inherit rpm
