SUMMARY = "Generic Spell Checking Library - Command Line Tools"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-tools-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "093699f5b2d2a18ea0fb86a549af29089da422b7e5bb164e3ac0541fd1ba56e47e99694251acd4f637034cadd26ac95de79a5c9f28408733fa47f65ea072a19b"

RPROVIDES:${PN} += "enchant-1-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0"

inherit rpm
