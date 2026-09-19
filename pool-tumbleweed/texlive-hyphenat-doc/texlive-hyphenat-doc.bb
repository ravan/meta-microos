SUMMARY = "Documentation for texlive-hyphenat"
DESCRIPTION = "This package includes the documentation for texlive-hyphenat"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3csvn77682"

RPM_NAME = "texlive-hyphenat-doc-2026.226.2.3csvn77682-60.2.noarch.rpm"
RPM_HASH = "c35559a7359cd9b5242317bd95bb7779aa6294f7a26155a37e9a3ab266851d0a243dc1dac9cbae4261a1d9ee902bf62e719ea7058d42733518dca69d8174bc34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphenat-doc"

RDEPENDS:${PN} += ""

inherit rpm
