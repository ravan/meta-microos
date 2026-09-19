SUMMARY = "Documentation for texlive-comment"
DESCRIPTION = "This package includes the documentation for texlive-comment"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.8svn77682"

RPM_NAME = "texlive-comment-doc-2026.226.3.8svn77682-60.2.noarch.rpm"
RPM_HASH = "043d3b8846e3994dd96ef20bd0b3546eb697a501ea680cd185ca0105b1120c23ab6262af508db1c6cf2ca4e6f9a5f40eb034689e659af9369906c925c3d450f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comment-doc"

RDEPENDS:${PN} += ""

inherit rpm
