SUMMARY = "Wrapper for AWK interpreter"
DESCRIPTION = "RunAWK is a small wrapper for AWK interpreter that helps to write \
the standalone programs in AWK. It provides modules for AWK \
similar to PERL's 'use' command and other powerful features. \
Dozens of ready to use modules are also provided."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-1.6.1-2.9.aarch64.rpm"
RPM_HASH = "b7850c1214fc711479b369add366f63752ddfd6531ef3d700555fe6b7531a8764f3e346858a4c72a9408aaa9a9f6c31a59ceee32092c5b48b379e390a6e5ee73"

RPROVIDES:${PN} += "runawk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
