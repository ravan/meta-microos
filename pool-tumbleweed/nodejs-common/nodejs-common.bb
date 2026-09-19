SUMMARY = "Common files for the NodeJS ecosystem"
DESCRIPTION = "Common NodeJS files that allow recursive invocation of Node executable \
while retaining the same codestream version."
LICENSE = "MIT"

PV = "6.1"

RPM_NAME = "nodejs-common-6.1-5.3.aarch64.rpm"
RPM_HASH = "83675ff03e7177f147ac57b655dee0fb42e87dfb0239cdbc8b31a40c63c695d2e44ab6020c77a915fc28a00ccd5114474ef89008c33873cc71d18d7edcbe5f89"

RPROVIDES:${PN} += "nodejs-common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalternatives.so.1 \
libc.so.6 \
nodejs"

inherit rpm
