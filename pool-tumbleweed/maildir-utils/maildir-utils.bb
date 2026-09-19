SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.3"

RPM_NAME = "maildir-utils-1.14.3-1.1.aarch64.rpm"
RPM_HASH = "6330ee32aeef0ccbf771455a46982d06a767e8f3e04589e981545aa5beefcb922eb36c7790b41dcbe77bbc30ea985a8c51dd2c2f379a94761f539cbee4748e7a"

RPROVIDES:${PN} += "maildir-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcld2.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libguile-3.0.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
