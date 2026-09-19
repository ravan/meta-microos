SUMMARY = "Documentation for texlive-collectbox"
DESCRIPTION = "This package includes the documentation for texlive-collectbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4csvn77682"

RPM_NAME = "texlive-collectbox-doc-2026.226.0.0.4csvn77682-60.2.noarch.rpm"
RPM_HASH = "26cdeb310428095c8e2f7001bbbb7ef1fbb1adc0b23f9ebf1862d28388d5505fe333dc4ff351232e708b2a32b715788e51c24366d70797b02efa6655a12bd40e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collectbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
