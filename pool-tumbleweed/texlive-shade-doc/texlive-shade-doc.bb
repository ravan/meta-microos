SUMMARY = "Documentation for texlive-shade"
DESCRIPTION = "This package includes the documentation for texlive-shade"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn22212"

RPM_NAME = "texlive-shade-doc-2026.226.1svn22212-60.2.noarch.rpm"
RPM_HASH = "2dcec677c785faeae952e64ee2d14ff03d44eab696df0a77267836d5e945d1d22564f5b61032fefdee76bc02cca1e7eab66f6b9f0f0e57ed0f9db18808e3497e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-shade-doc-en \
texlive-shade-doc"

RDEPENDS:${PN} += ""

inherit rpm
