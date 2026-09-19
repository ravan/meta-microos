SUMMARY = "Documentation for texlive-babel-norsk"
DESCRIPTION = "This package includes the documentation for texlive-babel-norsk"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0ksvn77682"

RPM_NAME = "texlive-babel-norsk-doc-2026.226.2.0ksvn77682-60.2.noarch.rpm"
RPM_HASH = "5cd81dc9e5080e593eb516f029d0bb1823fda5dbf58e6830d8b30fa38bdd7e6fcd7f5e435012425b78bb2e9dedb891a0f0c57ed6ce1003e1de3e508a1508d4ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
