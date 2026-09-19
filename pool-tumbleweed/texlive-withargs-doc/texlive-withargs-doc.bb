SUMMARY = "Documentation for texlive-withargs"
DESCRIPTION = "This package includes the documentation for texlive-withargs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1svn76924"

RPM_NAME = "texlive-withargs-doc-2026.226.0.0.3.1svn76924-60.2.noarch.rpm"
RPM_HASH = "e03f0c2ac9216b89e67c8bbfcfd6c8f3de0cef541fe7c0e7ba3a202985d4be4a89025686f51dd3165aec01abf79879c84afdb940836b5907f4e67a5b1a177a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-withargs-doc"

RDEPENDS:${PN} += ""

inherit rpm
