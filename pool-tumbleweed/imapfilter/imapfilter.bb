SUMMARY = "A mail filtering utility"
DESCRIPTION = "IMAPFilter is a mail filtering utility. It connects to remote mail \
servers using the Internet Message Access Protocol (IMAP), sends \
searching queries to the server and processes mailboxes based on the \
results. It can be used to delete, copy, move, flag, etc. messages \
residing in mailboxes at the same or different mail servers. The 4rev1 \
and 4 versions of the IMAP protocol are supported. \
 \
IMAPFilter uses the Lua programming language as a configuration and \
extension language."
LICENSE = "MIT"

PV = "2.8.5"

RPM_NAME = "imapfilter-2.8.5-1.4.aarch64.rpm"
RPM_HASH = "33af0061352b58017412a44f8ebb937d4600f12b70c3bdb89dd534b40e04754040b14c67f5e027ca0e1faeaf68853e43853469b155797758a2ba344f327720c1"

RPROVIDES:${PN} += "imapfilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblua5.4.so.5 \
libpcre2-8.so.0 \
libssl.so.3"

inherit rpm
