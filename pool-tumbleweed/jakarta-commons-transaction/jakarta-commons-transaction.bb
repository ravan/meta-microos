SUMMARY = "Commons Transaction"
DESCRIPTION = "Commons Transaction aims at providing lightweight, standardized, well \
tested and efficient implementations of utility classes commonly used \
in transactional Java programming. Initially there are implementations \
for multi level locks, transactional collections and transactional file \
access. There may be additional implementations when the common need \
for them becomes obvious. However, the complete component shall remain \
compatible to JDK1.2 and should have minimal dependencies."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-transaction-1.1-29.5.noarch.rpm"
RPM_HASH = "e211aac945ce3e4c02dc66740e24580327bf8768ee89925353e86a0a827ac1dd81c1a75ed603ed6d62ff7b728e1358ebdd930e9bd8ceab5f570f0eeed7d54fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-transaction"

RDEPENDS:${PN} += "geronimo-jta-1-1-api \
jakarta-commons-codec \
reload4j \
xerces-j2 \
xml-commons-apis"

inherit rpm
