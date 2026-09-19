SUMMARY = "SSH protocol access from Guile"
DESCRIPTION = "The shared libraries for guile-ssh, which let you access the SSH protocol from \
Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.18.0"

RPM_NAME = "libguile-ssh18-0.18.0-1.8.aarch64.rpm"
RPM_HASH = "1051e1ac27d75fa4a787fadbcd342d66617f63201cb506c41cb89c1bbbc3b807bdfa3c6761e7bb0562cb1834ffadec717b1c7e427df358c4edb8034dbc6aa213"

RPROVIDES:${PN} += "libguile-ssh.so.18 \
libguile-ssh18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libssh.so.4"

inherit rpm
