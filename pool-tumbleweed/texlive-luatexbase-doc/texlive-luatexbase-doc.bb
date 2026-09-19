SUMMARY = "Documentation for texlive-luatexbase"
DESCRIPTION = "This package includes the documentation for texlive-luatexbase"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-luatexbase-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "524be639f54db1578fa0ea8062cc2a4a4b653d258593c8594dad521625a0d301da729937ab8ee24c3ea57d9749b4509a57b76d716f13c5b2b353b31b74d9e224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatexbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
