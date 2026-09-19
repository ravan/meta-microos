SUMMARY = "SSH agent binary for gcr"
DESCRIPTION = "gcr-ssh-agent as a standalone binary, so that it can easily be \
managed through systemd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-ssh-agent-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "41d060e63837afc980edf9edadbc063a2d07e525ef4686c2409679d9ae2a2b6be0cde5d38f608fd476eb7f73913ec0040aef4dc0ffb15f067fca4896ab30e4d2"

RPROVIDES:${PN} += "gcr-ssh-agent \
gcr3-ssh-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsecret-1.so.0 \
libsystemd.so.0"

inherit rpm
