SUMMARY = "Documentation for texlive-xstring"
DESCRIPTION = "This package includes the documentation for texlive-xstring"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.86svn77682"

RPM_NAME = "texlive-xstring-doc-2026.226.1.86svn77682-59.4.noarch.rpm"
RPM_HASH = "a95f212654876db4cfaa3357c8b6e8afa325e69b6c2443cb1433e8393f0a6a14e3adf13e0bc02a97c116c2a85ad5e122c175b810f1b2d2b2078aea435fc0e09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xstring-doc-en;fr \
texlive-xstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
