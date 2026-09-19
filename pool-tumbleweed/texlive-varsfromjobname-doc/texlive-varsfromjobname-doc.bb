SUMMARY = "Documentation for texlive-varsfromjobname"
DESCRIPTION = "This package includes the documentation for texlive-varsfromjobname"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-varsfromjobname-doc-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "d889fad19b0afb95cbe1f4d07b4113b3e9f84e09245d470eb04a2d64e819d07b01f652d57967c692b6caba92e47fb8a81e1ea5a13b490478198822ec6b132c08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varsfromjobname-doc"

RDEPENDS:${PN} += ""

inherit rpm
