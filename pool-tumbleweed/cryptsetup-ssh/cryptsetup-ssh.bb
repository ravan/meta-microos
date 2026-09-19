SUMMARY = "Cryptsetup LUKS2 SSH token"
DESCRIPTION = "Experimental cryptsetup plugin for unlocking LUKS2 devices with \
token connected to an SSH server."
LICENSE = "LGPL-2.0-or-later-with-cryptsetup-OpenSSL-exception"

PV = "2.8.7"

RPM_NAME = "cryptsetup-ssh-2.8.7-1.2.aarch64.rpm"
RPM_HASH = "d8c4b57f7818785559bb90d3a93b1a692a44a18e36206b5e6f47e4ac57884310a2577b2228ab486c97fce1c39fe222859e6cafef6cafe98581b8720bc248e8e5"

RPROVIDES:${PN} += "cryptsetup-ssh \
libcryptsetup-token-ssh.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libjson-c.so.5 \
libssh.so.4"

inherit rpm
