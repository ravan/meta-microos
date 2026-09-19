SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.194"

RPM_NAME = "debuginfod-client-0.194-1.2.aarch64.rpm"
RPM_HASH = "9e8df6c52615edff3bc7784949f1f9a5c4391b81c9f3c700538d71b5234a8ce92da95605d7a004a01b10db1e4978572e8d759a77ef4f07bdcc2c870c15443d33"

RPROVIDES:${PN} += "debuginfod-client"

RDEPENDS:${PN} += "config-debuginfod-profile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1 \
libjson-c.so.5"

inherit rpm
