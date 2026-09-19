SUMMARY = "Command line access to Scalability Protocols"
DESCRIPTION = "nngcat, a command line tool that sends and receives messages over nng \
(nanomsg next-generation) sockets.  It speaks every Scalability Protocol \
the library implements, which makes it useful for probing, testing and \
debugging applications built on nng."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "nng-utils-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "85cbd29c30fc123b7924c24a5bff6dfdbda734526d0e05004cef4b73de57c605f7ec6053b6971612ecc6a419b12001a25f190f78d765f0ae2f8d528bfe5219e7"

RPROVIDES:${PN} += "nng-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnng.so.1 \
libnng1"

inherit rpm
