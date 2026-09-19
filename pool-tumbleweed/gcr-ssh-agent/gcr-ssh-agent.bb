SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "gcr-ssh-agent-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "7b519e6a36fb53da3fb87a385a5201d010c9c5efb7fe44ef10861baa7009711c40b84d0124f539821565fc5a7bd4237195695cd52c32a3d75752522437afd2ce"

RPROVIDES:${PN} += "gcr-ssh-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsystemd.so.0"

inherit rpm
