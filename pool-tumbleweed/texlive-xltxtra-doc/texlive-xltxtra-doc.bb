SUMMARY = "Documentation for texlive-xltxtra"
DESCRIPTION = "This package includes the documentation for texlive-xltxtra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-xltxtra-doc-2026.226.0.0.7svn77682-59.4.noarch.rpm"
RPM_HASH = "ab4c8a78e95adeba888fb3a07cb38757e96bd042f90374eb1df8888317e01e9b3d1e102294a61859a8b2fece94aba786fda41415dbcb585f6d3a06de77755309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
