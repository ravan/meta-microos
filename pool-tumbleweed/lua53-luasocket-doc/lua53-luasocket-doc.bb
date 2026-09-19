SUMMARY = "Documentation for lua53-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua53-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua53-luasocket-doc-3.1.0-5.3.noarch.rpm"
RPM_HASH = "61da9feed7cf6533156a5572207810a4f0b8cbc8d72b6e4417fcce32806ea938ca6d7762de5e9db0c1783b781335c6ae8ec841d9917928c3f171d25cd9f2a65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luasocket-doc"

RDEPENDS:${PN} += ""

inherit rpm
