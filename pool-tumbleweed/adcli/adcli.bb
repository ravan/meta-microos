SUMMARY = "Tool for performing actions on an Active Directory domain"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.3.1"

RPM_NAME = "adcli-0.9.3.1-2.7.aarch64.rpm"
RPM_HASH = "accf1b6bd90a572e8b415d2deb23699d745a570ccff0ed36977bd3dac93d79ea822f438e8efcfefdda13c7a000ed30bfdb0db97f9fc1e30fd94036cfdea687e4"

RPROVIDES:${PN} += "adcli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libresolv.so.2 \
libselinux.so.1"

inherit rpm
