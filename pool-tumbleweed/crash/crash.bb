SUMMARY = "Crash utility for live systems; netdump, diskdump, LKCD or mcore dumpfiles"
DESCRIPTION = "The core analysis suite is a self-contained tool that can be used to \
investigate either live systems, kernel core dumps created from the \
netdump and diskdump packages from Red Hat Linux, the mcore kernel \
patch offered by Mission Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "9.0.2"

RPM_NAME = "crash-9.0.2-1.6.aarch64.rpm"
RPM_HASH = "381cca340306002c80deafe109d51b46095cf02ec638b033d88eaf45d5cc64c102ffb7a382772b718721d857752554b1c8cee64eaefca02ca2766b22bb7dd227"

RPROVIDES:${PN} += "crash"

RDEPENDS:${PN} += "/usr/bin/nm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
liblzo2.so.2 \
libm.so.6 \
libmpfr.so.6 \
libncursesw.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libzstd.so.1"

inherit rpm
