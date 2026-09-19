SUMMARY = "Configurable IDENT Server That Supports NAT/IP Masquerading"
DESCRIPTION = "Oidentd is an ident (rfc1413 compliant) daemon that runs on Linux, \
Darwin, FreeBSD, OpenBSD, NetBSD, and Solaris.	oidentd can handle IP \
masqueraded/NAT connections on Linux, Darwin, FreeBSD (ipf only), \
OpenBSD, and  NetBSD.  Oidentd has a flexible mechanism for specifying \
ident responses.  Users can be granted permission to specify their own \
ident responses.  Responses can be specified according to host and port \
pairs."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "oidentd-3.1.0-3.10.aarch64.rpm"
RPM_HASH = "12ce348f9421be7a1ca519e7c4dfc254ea3214f2286079c80a3996231c78fa30306df3e41e55c5ed8717c7a93d7949ed05873d1c9ce8f5b8deadf950d67c2c02"

RPROVIDES:${PN} += "config-oidentd \
oidentd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
