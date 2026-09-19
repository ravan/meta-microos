SUMMARY = "Secure PIN handling using NSS crypto"
DESCRIPTION = "svrcore provides applications with several ways to handle secure PIN storage \
e.g. in an application that must be restarted, but needs the PIN to unlock \
the private key and other crypto material, without user intervention.  svrcore \
uses the facilities provided by NSS."
LICENSE = "MPL-2.0"

PV = "3.3.1+8c2711bd6"

RPM_NAME = "libsvrcore0-3.3.1+8c2711bd6-1.1.aarch64.rpm"
RPM_HASH = "4a6bf318c3a56ae0d7d6c0767fa4b74fd723c99962b9ed1ef1c6a33e91964f3c242e324f4cbd338245fd4e4724fb39bf3ac40d8d4d1a8402f97f4ead82f49b6d"

RPROVIDES:${PN} += "libsvrcore.so.0 \
libsvrcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss3.so"

inherit rpm
