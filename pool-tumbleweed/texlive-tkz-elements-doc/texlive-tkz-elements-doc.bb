SUMMARY = "Documentation for texlive-tkz-elements"
DESCRIPTION = "This package includes the documentation for texlive-tkz-elements"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.02csvn78006"

RPM_NAME = "texlive-tkz-elements-doc-2026.226.5.02csvn78006-59.2.noarch.rpm"
RPM_HASH = "e64f123d2078a469a304c900c24d449e9ef5b8d1c168c038708bb37f32b4e802c7af5e9ca73465016d63fe9981ff7881a47fbe6e98ae9f29a2b60891049edb1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-elements-doc"

RDEPENDS:${PN} += ""

inherit rpm
