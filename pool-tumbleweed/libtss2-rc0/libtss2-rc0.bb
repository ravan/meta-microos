SUMMARY = "TPM2 error code translation library"
DESCRIPTION = "This library can translate TPM error codes into human readable strings."
LICENSE = "BSD-2-Clause"

PV = "4.1.3"

RPM_NAME = "libtss2-rc0-4.1.3-1.6.aarch64.rpm"
RPM_HASH = "104e5d9dcc7e804dc135d2964a972041fe58926683c9174a5be71497a8663c4dc0c74dc2ebd2cb784129ad242e85c450efa2bf61ea741009522173bda300984a"

RPROVIDES:${PN} += "libtss2-rc.so.0 \
libtss2-rc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
