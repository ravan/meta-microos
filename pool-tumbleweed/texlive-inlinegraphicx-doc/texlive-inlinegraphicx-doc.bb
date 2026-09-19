SUMMARY = "Documentation for texlive-inlinegraphicx"
DESCRIPTION = "This package includes the documentation for texlive-inlinegraphicx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn78036"

RPM_NAME = "texlive-inlinegraphicx-doc-2026.226.0.0.20asvn78036-60.2.noarch.rpm"
RPM_HASH = "bc40aec2a553c2f2961ec4e8bc1bdeb8daa776971e1a0389019bcd8a9e31ff79a6ce60e20c3027e437c8d6dc246769398f94ee4aaff2fa1eb73e6c020b73da3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinegraphicx-doc"

RDEPENDS:${PN} += ""

inherit rpm
