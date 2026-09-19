SUMMARY = "Documentation for the git-buildpackage suite"
DESCRIPTION = "This package contains documentation for the git-buildpackage suite - both the \
Debian and the RPM tool set."
LICENSE = "GPL-2.0-only"

PV = "0.9.23"

RPM_NAME = "git-buildpackage-doc-0.9.23-1.12.noarch.rpm"
RPM_HASH = "ae00b421145f54181e3b5ba2bad614836b02a9e601505289b5b93aa81d0915fb3158f2d838420ebb00a5963799ba3c7bebd898976552d26f3afbd55a487a70e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-buildpackage-doc"

RDEPENDS:${PN} += ""

inherit rpm
