SUMMARY = "Documentation for texlive-fonts-tlwg"
DESCRIPTION = "This package includes the documentation for texlive-fonts-tlwg"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7.3svn60817"

RPM_NAME = "texlive-fonts-tlwg-doc-2026.226.0.0.7.3svn60817-60.2.noarch.rpm"
RPM_HASH = "d603a7d42e8192fb5a903994304649ad32cbee8b7cad62c3f5b8f957ff6b3f9f452f806d89e836d6afe9fe237f9a8e2164cf40c59e7ba9267d8ce25208315746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-tlwg-doc"

RDEPENDS:${PN} += ""

inherit rpm
