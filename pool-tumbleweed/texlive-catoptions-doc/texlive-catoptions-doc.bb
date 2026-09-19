SUMMARY = "Documentation for texlive-catoptions"
DESCRIPTION = "This package includes the documentation for texlive-catoptions"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.7isvn68982"

RPM_NAME = "texlive-catoptions-doc-2026.226.0.0.2.7isvn68982-59.2.noarch.rpm"
RPM_HASH = "7ffbc3b98a6ea795722a088a6896a0cca6bbde9b5e0b8d02cbc008b14bd8b6cf2681b89166ce58ebe98b38dfa081a4b701068b6c35a5e1528ee888727627dcd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
