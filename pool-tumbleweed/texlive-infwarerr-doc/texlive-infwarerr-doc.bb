SUMMARY = "Documentation for texlive-infwarerr"
DESCRIPTION = "This package includes the documentation for texlive-infwarerr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-infwarerr-doc-2026.226.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "484a5d589854b89c2c14c39fdb3a3b70a1e35fb336e676ddcd478af9b9e70f78fd70ad91545e30fbbc174598ab62fbc70d59faa378d6c3db0cf03f7575ad6a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-infwarerr-doc"

RDEPENDS:${PN} += ""

inherit rpm
