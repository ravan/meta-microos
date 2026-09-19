SUMMARY = "A client program for the telnet remote login protocol"
DESCRIPTION = "Telnet is an old protocol for logging into remote systems.  It is \
rarely used, since the transfer is not encrypted (ssh is mostly used \
these days).  The telnet client is often used for debugging other \
network services. The command \
 \
telnet localhost 25 \
 \
connects to the local smtp server, for example."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-1.2-177.10.aarch64.rpm"
RPM_HASH = "64eb78711b604415b97198a468d91ff649a0cbc00a26782be3f66358c7fe3aef64bdb6bb75e71991826f6a794ef0d693fe01419730d41bb2b05e1a79d5c74255"

RPROVIDES:${PN} += "nkitb-/usr/bin/telnet \
telnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
