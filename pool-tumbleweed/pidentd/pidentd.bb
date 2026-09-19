SUMMARY = "An Implementation of the RFC1413 Identification Server"
DESCRIPTION = "This package contains identd, which implements a RFC1413 identification \
server.  Identd looks up specific TCP/IP connections and returns the \
user name and other information about the connection."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.19"

RPM_NAME = "pidentd-3.0.19-7.10.aarch64.rpm"
RPM_HASH = "558ee8f91f5b22cef1acb056ac0fd4555b3b434aa2b6da37d3b200b4b04fde9beb1342d0d4a4cdfe4f1d69d966e748a6e19286db5fc97c60a87c70fc71db2503"

RPROVIDES:${PN} += "config-pidentd \
pidentd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
