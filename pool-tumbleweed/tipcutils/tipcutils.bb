SUMMARY = "Transparent Inter Process Communication Protocol"
DESCRIPTION = "TIPC utilities (tipcutils) is a set of userspace programs used to \
configure and manage TIPC (http://tipc.sourceforge.net/). \
 \
The Transparent Inter Process Communication protocol allows \
applications in a clustered computer environment to communicate quickly \
and reliably with other applications, regardless of their location \
within the cluster."
LICENSE = "BSD-3-Clause"

PV = "3.0.6"

RPM_NAME = "tipcutils-3.0.6-2.3.aarch64.rpm"
RPM_HASH = "52904c9cdc0b1ddab7fe69ef98a53ee4f3397bc22312834a19fa82c48b6b6aca8dd3438a8d06e4448b1559788ba94ed24f2ea157a76a3a4a1ec61e7a335faf34"

RPROVIDES:${PN} += "tipcutils"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaemon.so.0 \
libmnl.so.0"

inherit rpm
