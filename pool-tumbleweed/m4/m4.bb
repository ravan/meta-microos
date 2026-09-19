SUMMARY = "GNU m4"
DESCRIPTION = "GNU m4 is an implementation of the traditional Unix macro processor."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.21"

RPM_NAME = "m4-1.4.21-2.1.aarch64.rpm"
RPM_HASH = "f4fdd304d879d7c5cfe53567a44d9b4231f423b8b379ced5f88aa71f411610e1df7130f70c6c197457f7003b3b1a1b42cdbc5663340b82ed7f48b615ffb3a24e"

RPROVIDES:${PN} += "base-/usr/bin/m4 \
m4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
