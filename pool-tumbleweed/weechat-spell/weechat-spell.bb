SUMMARY = "Aspell and Enchant Spell-Checking Support for weechat"
DESCRIPTION = "Spell-checking support for weechat, using the aspell and enchant libraries."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.1"

RPM_NAME = "weechat-spell-4.10.1-1.1.aarch64.rpm"
RPM_HASH = "b0caa9ef00995cce8ce2ce7e29ebace7fbc9e49c596e3371ec0375122f584cdd95dd668cdb7a77136ef86d02e286795739d3f7e69a7f86fde1e82cc12d313694"

RPROVIDES:${PN} += "weechat-aspell \
weechat-spell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
weechat"

inherit rpm
