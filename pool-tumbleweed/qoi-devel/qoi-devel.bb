SUMMARY = "Development header for The “Quite OK Image Format”"
DESCRIPTION = "Development header for The “Quite OK Image Format”."
LICENSE = "MIT"

PV = "0~20250212"

RPM_NAME = "qoi-devel-0~20250212-1.7.noarch.rpm"
RPM_HASH = "619e32a6e295b17fd97956cb16a43899463af9f43a6c426ebd69ba92e3f18e6de9671329763045d1c6ca933f6bffc7fa09f3a41c632d9940f112a37135133023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qoi-devel"

RDEPENDS:${PN} += ""

inherit rpm
