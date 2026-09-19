SUMMARY = "Tcl Scripting Support for weechat"
DESCRIPTION = "Support for weechat scripts written in the Tcl language."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-tcl-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "97b41606d1c31472bfcf5ce3abdebdd373fd920034e3ca252abd14a6f42ca717ad074b83e3530529b7b73920a16ddf8057ce5f5aa0d04949c90a124d0438a20e"

RPROVIDES:${PN} += "weechat-tcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
weechat"

inherit rpm
