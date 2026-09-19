SUMMARY = "Documentation for texlive-datetime2-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47031"

RPM_NAME = "texlive-datetime2-bulgarian-doc-2026.226.1.1svn47031-59.2.noarch.rpm"
RPM_HASH = "123d7cc67f8a96b24aa2821b55ae604f5f8587aa5e84160f4714f7f5c9711e22490926567e473bef5759b8a3920baf9cdb8b277e02f56fe7fcbc8980a96b1bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-bulgarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
