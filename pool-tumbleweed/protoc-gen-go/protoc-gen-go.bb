SUMMARY = "Go support for Google's protocol buffers"
DESCRIPTION = "protoc-gen-go implements Go bindings for protocol buffers. For information \
about protocol buffers themselves, see \
https://developers.google.com/protocol-buffers/"
LICENSE = "BSD-3-Clause"

PV = "1.34.2"

RPM_NAME = "protoc-gen-go-1.34.2-1.14.aarch64.rpm"
RPM_HASH = "bfef247e218e6c693acd462c7871dd3c5721991aa9743d76f169120186e19b10350ae5b38a1a1eabadbf38867dfe0f6a267d139b7570c1d913b7bf53bbaef454"

RPROVIDES:${PN} += "protoc-gen-go"

RDEPENDS:${PN} += ""

inherit rpm
