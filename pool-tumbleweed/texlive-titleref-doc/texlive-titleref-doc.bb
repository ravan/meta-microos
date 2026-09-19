SUMMARY = "Documentation for texlive-titleref"
DESCRIPTION = "This package includes the documentation for texlive-titleref"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-titleref-doc-2026.226.3.1svn77682-59.2.noarch.rpm"
RPM_HASH = "70917b6cdca4a2a384c995b69f54709cf4dd59b9c6a857301bf6d63c191541bfa2ade00c9a47fcbf3a447f7a5176e664321dfb50977ff9bad8beb2662d2dfc00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titleref-doc"

RDEPENDS:${PN} += ""

inherit rpm
