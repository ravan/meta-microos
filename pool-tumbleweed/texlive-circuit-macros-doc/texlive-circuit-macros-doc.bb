SUMMARY = "Documentation for texlive-circuit-macros"
DESCRIPTION = "This package includes the documentation for texlive-circuit-macros"
LICENSE = "LPPL-1.0"

PV = "2026.226.10.9svn76218"

RPM_NAME = "texlive-circuit-macros-doc-2026.226.10.9svn76218-60.2.noarch.rpm"
RPM_HASH = "262d029b10d0f154530223c81584ad5d51178463edadb605575c1980865e34c72094ba8b023fb379120bdd9f5ecfe80bdd0d1f895d13a88fa6b0aad267b9eece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuit-macros-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
