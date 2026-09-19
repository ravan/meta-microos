SUMMARY = "TPM2 System API (SAPI)"
DESCRIPTION = "System API (SAPI) as described in the system level API and TPM command \
transmission interface specification. This API is a 1-to-1 mapping of the TPM2 \
commands documented in Part 3 of the TPM2 specification. Additionally there \
are asynchronous versions of each command. These asynchronous variants may be \
useful for integration into event-driven programming environments. Both the \
synchronous and asynchronous API are exposed through this library."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-sys1-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "37e632c7d085e634cc4334f7cc2ba32d70a132b171fd9e7b2a1981ce79e8eb76e16c1f3c60bd4403b029de65dd74f4afa9944d79560441615494a03965ae9251"

RPROVIDES:${PN} += "libtss2-sys.so.1 \
libtss2-sys1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0"

inherit rpm
