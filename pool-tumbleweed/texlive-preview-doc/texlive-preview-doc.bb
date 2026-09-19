SUMMARY = "Documentation for texlive-preview"
DESCRIPTION = "This package includes the documentation for texlive-preview"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.14.0.6svn71662"

RPM_NAME = "texlive-preview-doc-2026.226.14.0.6svn71662-59.2.noarch.rpm"
RPM_HASH = "4257bb5fb2504f3f2d0628a6a6596de94a908b01d787a6485bb498e2eafb667f63c49f519d7fb5b8d7310dd952d998b44de604a34138d37380c650b0bf5fbc9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preview-doc"

RDEPENDS:${PN} += ""

inherit rpm
