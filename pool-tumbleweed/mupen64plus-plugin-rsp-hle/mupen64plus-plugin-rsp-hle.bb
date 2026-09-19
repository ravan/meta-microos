SUMMARY = "RSP High-Level Emulation Plugin For the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "This package contains the RSP High-Level emulation plugin for the Mupen64plus \
Nintendo 64 Emulator."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "mupen64plus-plugin-rsp-hle-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "8c6d318741a336851fd7939933306d42f1634a40deaff139895a2c441746949bb83c301da1dba45f8fa35351b4642f06d3a234e76edb859d1932885bc3fc9e72"

RPROVIDES:${PN} += "mupen64plus-plugin-rsp \
mupen64plus-plugin-rsp-hle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
