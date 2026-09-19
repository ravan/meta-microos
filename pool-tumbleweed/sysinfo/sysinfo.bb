SUMMARY = "System diagnosis tools from hxtools"
DESCRIPTION = "This subpackage contains programs from the hxtools suite that \
give info about available system components. \
 \
* clock_info(1) – show available system clocks for clock_gettime(2) \
* pmap_dirty(1) — display amount of RAM a process uses hard \
* sysinfo(1) — print IRC-style system information banner"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "sysinfo-20251011-1.6.aarch64.rpm"
RPM_HASH = "7566b7a66f69636dd2b10f26decbb8596525dca6107fe0ddbf57a13994f896ff8c0c4d0c2c62b7f81e3bc95ed52c58cded1a66f8662a9e30dd6a50c8a577f82c"

RPROVIDES:${PN} += "sysinfo"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6 \
libmount.so.1 \
libpci.so.3 \
libxcb.so.1"

inherit rpm
