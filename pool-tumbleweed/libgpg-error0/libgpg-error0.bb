SUMMARY = "Library That Defines Common Error Values for All GnuPG Components"
DESCRIPTION = "This is a library that defines common error values for all GnuPG \
components.  Among these are GPG, GPGSM, GPGME, GPG-Agent, libgcrypt, \
pinentry, SmartCard Daemon, and possibly more in the future."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.61"

RPM_NAME = "libgpg-error0-1.61-2.1.aarch64.rpm"
RPM_HASH = "98864e6049af783145a7561a393f5e4ea4387236b6b4a970bc4c69b49f79f43664a7637c303a0469c08261da301375da72c17a344a92bb7ec416c4208a03b8bf"

RPROVIDES:${PN} += "libgpg-error \
libgpg-error.so.0 \
libgpg-error0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
