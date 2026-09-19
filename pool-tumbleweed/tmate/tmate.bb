SUMMARY = "Instant terminal sharing"
DESCRIPTION = "Tmate is a fork of tmux providing an instant pairing solution."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "tmate-2.4.0-5.12.aarch64.rpm"
RPM_HASH = "5d188773af49175e9476be5f041008736259e3fa6ff22de0b93123647bd3e978cbd2a83b9ebaff4626e69618626f674955d945d1e223af7ddbd3169128f75f02"

RPROVIDES:${PN} += "tmate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libmsgpack-c.so.2 \
libresolv.so.2 \
libssh.so.4 \
libtinfo.so.6"

inherit rpm
