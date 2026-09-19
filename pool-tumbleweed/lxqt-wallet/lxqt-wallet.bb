SUMMARY = "Secure storage of information for LXQt"
DESCRIPTION = "Secure storage of information in kwallet that can be presented in \
key-values pair like user names-passwords pairs."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "lxqt-wallet-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "8c73620dc944c0cced9395ff50ec8bd7c57ff2f32e29e809d30318a04961ba90f7b6b3bfb3071fb861055a5da780ff8fdbe4dcf5413fcadfd28fa2369fed52b8"

RPROVIDES:${PN} += "lxqt-wallet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
