SUMMARY = "Remote Subversion Repository Dumping Tool"
DESCRIPTION = "rsvndump is a command line tool that is able to dump a subversion \
repository that resides on a remote server. All data is dumped in the \
format that can be read/written by svnadmin, so the data produced by \
rsvndump can easily be imported into a new subversion repository."
LICENSE = "GPL-3.0-only"

PV = "0.6.2"

RPM_NAME = "rsvndump-0.6.2-1.10.aarch64.rpm"
RPM_HASH = "ac835932071e54307410e5f1d9ece255038eed6a875e0e50b9bedb5ecf94abfc7838ca12448f6e595810d3390b3d408dce2823d5764fc535029547ad820760a2"

RPROVIDES:${PN} += "rsvndump"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-subr-1.so.0"

inherit rpm
