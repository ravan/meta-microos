SUMMARY = "Development files for BoringSSL"
DESCRIPTION = "Development files for BoringSSL - an implementation of the Secure \
Sockets Layer (SSL) and Transport Layer Security (TLS) protocols, \
derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "0.20260813"

RPM_NAME = "boringssl-devel-0.20260813-2.1.aarch64.rpm"
RPM_HASH = "56ef4f175b4a8a3f8ee6c022444ee0b3a6f1ef1ade387f56fee8b80e1e86dc0e439890c9ae501fffd701eb4a3bebde94ac04918748730da4d2fea0f56167ad64"

RPROVIDES:${PN} += "boringssl-devel"

RDEPENDS:${PN} += "libboringssl1"

inherit rpm
