SUMMARY = "Query the total free and used physical memory"
DESCRIPTION = "Sys::MemInfo return the total amount of free and used physical memory in \
bytes in totalmem and freemem variables. \
 \
Total amount of free and user swap memory are alse returned in totalswap \
and freeswap variables. \
 \
This module has been tested on Linux 3.13.0, UnixWare 7.1.2, AIX5, OpenBSD \
3.8, NetBSD 2.0.2, FreBSD 5.4, HPUX11, Solaris 9, Tru64 5.1, Irix 6.5, Mac \
OS X 10.2 darwin and Windows XP. \
 \
It should work on FreeBSD 4 and Windows 9X/ME/NT/200X/Vista."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.99"

RPM_NAME = "perl-Sys-MemInfo-0.99-1.32.aarch64.rpm"
RPM_HASH = "6cd4d383376a3baf2ac52396d9bc12065933bb8719067cbdcbff24e05fe87d5eb01c569b3fbf55d66e42335f624d82efc737efdb2c5693a9a6602f24a7ec00e8"

RPROVIDES:${PN} += "perl-Sys--MemInfo \
perl-Sys-MemInfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
