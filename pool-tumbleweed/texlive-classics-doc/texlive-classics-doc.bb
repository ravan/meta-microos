SUMMARY = "Documentation for texlive-classics"
DESCRIPTION = "This package includes the documentation for texlive-classics"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn76924"

RPM_NAME = "texlive-classics-doc-2026.226.0.0.1asvn76924-60.2.noarch.rpm"
RPM_HASH = "477be0aca94e982d4c3e01a32e58bafcc2f65e44eb0fa8e6c45f7f5071df12d776f82a49ac99ab8fe908d293e129f0c6faf4eea45b4a4554bef1d00378ce649c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classics-doc"

RDEPENDS:${PN} += ""

inherit rpm
