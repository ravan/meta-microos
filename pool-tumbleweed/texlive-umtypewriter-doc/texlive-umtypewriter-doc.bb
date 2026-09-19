SUMMARY = "Documentation for texlive-umtypewriter"
DESCRIPTION = "This package includes the documentation for texlive-umtypewriter"
LICENSE = "OFL-1.1"

PV = "2026.226.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-doc-2026.226.1.1svn64443-60.2.noarch.rpm"
RPM_HASH = "e21fb6409a68b5dac065eec293e7344f8dffc3a40b194dc699bea7469d514aeb6516cf2e200cee98315a112dbdc559274842cb668bb3fc13c63a6af9b8c38c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
