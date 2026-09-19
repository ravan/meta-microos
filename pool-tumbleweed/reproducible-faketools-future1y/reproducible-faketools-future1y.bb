SUMMARY = "Run build with the timestamp set to 1y in the future"
DESCRIPTION = "Run the build with the timestamp set to 1y in the future"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-future1y-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "53eeddb5d0df03a4c18fb6e587a6c2f16b2221ea43766923e7d2b0f7d7c59935f09c445c64dc2d80bbb567d9c2192c7fb012e992fc4806dd5439fa51f06c12f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-future1y"

RDEPENDS:${PN} += "reproducible-faketools-future"

inherit rpm
