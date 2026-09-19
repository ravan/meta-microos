SUMMARY = "Command-line interface for the hledger accounting system"
DESCRIPTION = "The command-line interface for the hledger accounting system. Its basic \
function is to read a plain text file describing financial transactions and \
produce useful reports. \
 \
hledger is a robust, cross-platform set of tools for tracking money, time, or \
any other commodity, using double-entry accounting and a simple, editable file \
format, with command-line, terminal and web interfaces. It is a Haskell rewrite \
of Ledger, and one of the leading implementations of Plain Text Accounting. \
Read more at: <https://hledger.org>."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "hledger-1.52.1-1.5.aarch64.rpm"
RPM_HASH = "b257170215d26d4e0a6355a5acc752cef117de232f768d719691bb1aeccb46a009d956d14ad29f7f8e0a334f2cec8414399c6d93169fd1f976bb2a35da274377"

RPROVIDES:${PN} += "hledger"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
