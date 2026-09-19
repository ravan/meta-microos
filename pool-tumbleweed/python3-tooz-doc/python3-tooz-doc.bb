SUMMARY = "Documentation for python-tooz"
DESCRIPTION = "The Tooz project aims at centralizing the most common distributed primitives \
like group membership protocol, lock service and leader election by providing \
a coordination API helping developers to build distributed applications. \
 \
This package contains documentation in HTML format."
LICENSE = "Apache-2.0"

PV = "9.1.0"

RPM_NAME = "python3-tooz-doc-9.1.0-1.1.noarch.rpm"
RPM_HASH = "6b49d1fe9f3d87d2fbc52c53f28a802c56b1233f6e40e2b85b526393461734a982d997bfe0a232bc50738e505c53aaba60a57cc986f1cadd7d2dcd1fa7f319f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tooz-doc"

RDEPENDS:${PN} += ""

inherit rpm
