SUMMARY = "Documentation for texlive-fnpct"
DESCRIPTION = "This package includes the documentation for texlive-fnpct"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-fnpct-doc-2026.226.1.1asvn77682-60.2.noarch.rpm"
RPM_HASH = "29f573c58d6e25445f2e135806e9cd1ddc63e5092f40546a9c31faf0827708a1f9992a7c36c05982d99b681efc9fb5953ab9409bfd211809c096685eec28c114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpct-doc"

RDEPENDS:${PN} += ""

inherit rpm
