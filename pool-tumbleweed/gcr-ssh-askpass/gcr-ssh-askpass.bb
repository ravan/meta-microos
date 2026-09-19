SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "gcr-ssh-askpass-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "4e11327d9cdcd2b148916d16d23e060839db8ad6ec57e0571e1b80be54ac80ca43acb57e7dea404a9d423ed6f96368555943f38ff0120058f4e8d9f8702ad46e"

RPROVIDES:${PN} += "gcr-ssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
