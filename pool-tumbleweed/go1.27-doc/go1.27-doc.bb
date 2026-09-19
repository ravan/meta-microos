SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.27.1"

RPM_NAME = "go1.27-doc-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "90e9192da51848a91de24c63da4e9d176295c0493f8af7638a86ad30310c5ae2a72b5cb99e829a0a7649fdcb3c42f8799d19c22b5e90691d4f2af3eb19931d26"

RPROVIDES:${PN} += "go-doc \
go1.27-doc"

RDEPENDS:${PN} += ""

inherit rpm
