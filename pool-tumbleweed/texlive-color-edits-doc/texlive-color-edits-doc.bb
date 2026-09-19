SUMMARY = "Documentation for texlive-color-edits"
DESCRIPTION = "This package includes the documentation for texlive-color-edits"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56707"

RPM_NAME = "texlive-color-edits-doc-2026.226.1.1svn56707-60.2.noarch.rpm"
RPM_HASH = "534018c42e14251f579644787a3b917ada4c12b2b690961efbd7004656d88660cc1e3c59b54ad1771adb8d8ff8c7cd824e6463b813a268e09bc746eb9c5820e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-color-edits-doc"

RDEPENDS:${PN} += ""

inherit rpm
