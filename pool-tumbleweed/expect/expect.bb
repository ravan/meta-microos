SUMMARY = "A Tool for Automating Interactive Programs"
DESCRIPTION = "Expect is a tool primarily for automating interactive applications, \
such as telnet, ftp, passwd, fsck, rlogin, tip, and more.  Expect \
really makes this stuff trivial.  Expect is also useful for testing \
these applications.  It is described in many books, articles, papers, \
and FAQs.  There is an entire book on it available from O'Reilly."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-5.45.4-8.5.aarch64.rpm"
RPM_HASH = "165baab03043094190272fecca0bee269c257677c68d667bfdfa8184f13defb0931ac8ddab2bc563c91738759af89c2865a7c979c20c16e22a8b75c57f5b8722"

RPROVIDES:${PN} += "expect \
libexpect5.45.4.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtcl8.6.so"

inherit rpm
