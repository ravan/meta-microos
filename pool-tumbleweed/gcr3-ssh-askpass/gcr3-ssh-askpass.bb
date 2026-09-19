SUMMARY = "SSH password callback helper for gcr"
DESCRIPTION = "gcr-ssh-askpass allows an ssh command to callback for a password."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "gcr3-ssh-askpass-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "8ee7bbae7ad7924e017f6274b9fd539ce823ee77f36d240172d12617ca3445556e138330b78ee1f668df6df9e81c887235745bba111e5e0eae44a5cc26586551"

RPROVIDES:${PN} += "gcr3-ssh-askpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
