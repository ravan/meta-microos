SUMMARY = "Wrapper binary for kerberized printing"
DESCRIPTION = "A wrapper binary to run smbspool with the original calling UID."
LICENSE = "GPL-3.0+"

PV = "3.7.0"

RPM_NAME = "samba-krb-printing-3.7.0-1.36.aarch64.rpm"
RPM_HASH = "4e5df31706280939a64cab5f6794b59f6ed01bca8b81a3f870f1febb7096bfeb74404b788a56ad0e2d7f5c612711f0aedcb4f325114f7c903c9daadeb94fb978"

RPROVIDES:${PN} += "samba-gplv3-krb-printing \
samba-krb-printing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
cups \
group-lp \
libc.so.6 \
samba-client"

inherit rpm
