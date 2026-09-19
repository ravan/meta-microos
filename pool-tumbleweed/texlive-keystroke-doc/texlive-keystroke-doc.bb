SUMMARY = "Documentation for texlive-keystroke"
DESCRIPTION = "This package includes the documentation for texlive-keystroke"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-keystroke-doc-2026.226.1.6svn77682-63.2.noarch.rpm"
RPM_HASH = "6438cd085c209422f4d1b89123df1ad418cc4cbb681653ce8d889e4ae0e92d75a458d4dd3421ef967ed84e2893fee03052dc6cd554ebc60644d1497e55619636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keystroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
