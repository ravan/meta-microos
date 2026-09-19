SUMMARY = "Documentation for texlive-digestif"
DESCRIPTION = "This package includes the documentation for texlive-digestif"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.6svn72163"

RPM_NAME = "texlive-digestif-doc-2026.226.0.0.6svn72163-59.2.noarch.rpm"
RPM_HASH = "ca7da5662fe9a8cfb3f2b9dff864d898d3cc321ad473dcd1e352afe9260e7da3dcdc56ce4cbd95c3f29cbfc3cc96f5020ff5c45139aa7bff5f867cbaeb9451f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-digestif-doc"

RDEPENDS:${PN} += "/usr/bin/lua"

inherit rpm
