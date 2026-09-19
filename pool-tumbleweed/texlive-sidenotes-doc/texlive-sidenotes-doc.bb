SUMMARY = "Documentation for texlive-sidenotes"
DESCRIPTION = "This package includes the documentation for texlive-sidenotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn77682"

RPM_NAME = "texlive-sidenotes-doc-2026.226.1.20svn77682-60.2.noarch.rpm"
RPM_HASH = "2c8bf3f23752ac427b3310e6d867ebe77b8f52fd0186ccf0d4b4df1290dfec09d15905b9d1f043f36ae87fe3b92dbf9a8216ab1bdccbe00a3c9281610396de35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
