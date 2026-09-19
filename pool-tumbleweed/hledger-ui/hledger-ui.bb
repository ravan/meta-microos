SUMMARY = "Terminal interface for the hledger accounting system"
DESCRIPTION = "A simple terminal user interface for the hledger accounting system. It can be a \
more convenient way to browse your accounts than the CLI. \
 \
hledger is a robust, cross-platform set of tools for tracking money, time, or \
any other commodity, using double-entry accounting and a simple, editable file \
format, with command-line, terminal and web interfaces. It is a Haskell rewrite \
of Ledger, and one of the leading implementations of Plain Text Accounting. \
Read more at: <https://hledger.org>."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "hledger-ui-1.52.1-2.4.aarch64.rpm"
RPM_HASH = "4574c628e32188318f9028b01cdfd6e7b005834da6fa6a95bd6c24d261c2446ebc0085213d7c71442cb436ba8b427722e403e4fcf443651c96abb3bbc315b01a"

RPROVIDES:${PN} += "hledger-ui"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
