SUMMARY = "Documentation for texlive-tabfigures"
DESCRIPTION = "This package includes the documentation for texlive-tabfigures"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn25202"

RPM_NAME = "texlive-tabfigures-doc-2026.226.1.1svn25202-64.2.noarch.rpm"
RPM_HASH = "2f9f32fb4588ae7b6d3dabf49abd13e5b41193fcb2ea54521f139f06a7d1b4236ef153fd6008e4bc5868d4882795d52f729ac53dc8edf6e07caf79dedc3aa351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabfigures-doc"

RDEPENDS:${PN} += ""

inherit rpm
