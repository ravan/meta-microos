SUMMARY = "Tool to backup GnuPG secret keys on paper"
DESCRIPTION = "A reasonable way to achieve a long term backup of OpenPGP (GnuPG, PGP, etc) \
keys is to print them out on paper. Paper and ink have amazingly long retention \
qualities - far longer than the magnetic or optical means that are generally \
used to back up computer data."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "paperkey-1.6-1.27.aarch64.rpm"
RPM_HASH = "35e610199a5f5ee8e1867d75ba265a1646e6adb99ac314848903539390e00aacb97053c3647df3bd4fbb8b054648a28d7d61a8546e93e69005939375cbfca0dd"

RPROVIDES:${PN} += "paperkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
