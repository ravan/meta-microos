SUMMARY = "Text categorization library datafiles and documents"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization"
LICENSE = "BSD-4-Clause"

PV = "3.4.7"

RPM_NAME = "libexttextcat-3.4.7-2.9.aarch64.rpm"
RPM_HASH = "ef5a6dbce7411e76d55d59dc54d15a669297f3f96b2093c77a2213533fddd70aa2ac9c3cd7845168973993c2ea514341a91c658c6320f1ba564d416c8f5cdb4b"

RPROVIDES:${PN} += "libexttextcat \
libtextcat"

RDEPENDS:${PN} += ""

inherit rpm
