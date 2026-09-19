SUMMARY = "Documentation for texlive-chemcono"
DESCRIPTION = "This package includes the documentation for texlive-chemcono"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn17119"

RPM_NAME = "texlive-chemcono-doc-2026.226.1.3svn17119-60.2.noarch.rpm"
RPM_HASH = "63da078058f011909b75191b0a3ddd206b05ac5468cb291b3a775fe0525e6eb09d071ceba5ef295030f7d3f66ee2bd53068ab1bdded4419a360071e9d593b8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcono-doc"

RDEPENDS:${PN} += ""

inherit rpm
