SUMMARY = "Documentation for texlive-ebgaramond"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ebgaramond-doc-2026.226.svn77682-61.4.noarch.rpm"
RPM_HASH = "c5e84ee1be2ec4bdb3e82abf3ea26a184fad9145c5aa6edffade289994f07253b3f37e054319204d9cb5ededed2f595f5ed491a21580f7b485817a5dec08d805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-doc"

RDEPENDS:${PN} += ""

inherit rpm
