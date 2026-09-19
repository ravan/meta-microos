SUMMARY = "Documentation for texlive-breakurl"
DESCRIPTION = "This package includes the documentation for texlive-breakurl"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.40svn77682"

RPM_NAME = "texlive-breakurl-doc-2026.226.1.40svn77682-59.2.noarch.rpm"
RPM_HASH = "2fad343ec3bf2663bd07546f505c35a57ff1a2ee1921e7d4bc3a4c7de16aedf36137a923989a74998a13107e2f8c6df30bc46c75e351d2e0245ed30142fa4182"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-breakurl-doc"

RDEPENDS:${PN} += ""

inherit rpm
