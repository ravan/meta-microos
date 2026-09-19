SUMMARY = "Documentation for texlive-bosisio"
DESCRIPTION = "This package includes the documentation for texlive-bosisio"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn16989"

RPM_NAME = "texlive-bosisio-doc-2026.226.svn16989-59.2.noarch.rpm"
RPM_HASH = "325b5ed0b9febc37dcbdd42a0e8fc23be47a0ef9e691c62e4c22dd517384f69ab43cd42fda7c97a08cf270f73eee829bdabffe6886719bf928b2a0a402da16ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bosisio-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
