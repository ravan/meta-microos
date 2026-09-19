SUMMARY = "Documentation for texlive-lkproof"
DESCRIPTION = "This package includes the documentation for texlive-lkproof"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn20021"

RPM_NAME = "texlive-lkproof-doc-2026.226.3.1svn20021-61.2.noarch.rpm"
RPM_HASH = "1acda99363c5aa0ddbc0e98a16afa50490fd40b0af8b8bc84ecc43aeca356eff9425aa0089f52bcc8e99f97e8488e74ac90a162345737e530be6050a5fdfa739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lkproof-doc"

RDEPENDS:${PN} += ""

inherit rpm
