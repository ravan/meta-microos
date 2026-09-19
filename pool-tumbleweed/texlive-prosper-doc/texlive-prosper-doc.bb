SUMMARY = "Documentation for texlive-prosper"
DESCRIPTION = "This package includes the documentation for texlive-prosper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0hsvn77682"

RPM_NAME = "texlive-prosper-doc-2026.226.1.0hsvn77682-59.2.noarch.rpm"
RPM_HASH = "f0938b7417b5ef98e8cec08b222edcf8f20c5fb9d564102848e55b008a85001e16c42579419c05852436f8fb0365e13132922430dec46b822f93a7f2b050a28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
