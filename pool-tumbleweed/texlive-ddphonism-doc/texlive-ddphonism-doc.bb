SUMMARY = "Documentation for texlive-ddphonism"
DESCRIPTION = "This package includes the documentation for texlive-ddphonism"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn75201"

RPM_NAME = "texlive-ddphonism-doc-2026.226.0.0.3svn75201-59.2.noarch.rpm"
RPM_HASH = "8002ebd30f22f5a94f6795c745f91c9e60e7aeba71c74a710d69cdc0b907c67625f25d597cc3cda48178660513c11e6eabcb4e674ebed6554f5daf82f9a41709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ddphonism-doc"

RDEPENDS:${PN} += ""

inherit rpm
