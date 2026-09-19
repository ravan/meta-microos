SUMMARY = "Configuration tool for Ftrace"
DESCRIPTION = "trace-cmd is a command-line tool for configuring Ftrace."
LICENSE = "GPL-2.0-only"

PV = "3.4"

RPM_NAME = "trace-cmd-3.4-1.2.aarch64.rpm"
RPM_HASH = "3b64f507ed6a3e37faca7010836c5afbfedc12ee6b32378a2ba49c6275f916f31763753e7d5d67ad275df4c8f70102c7252f412984c3be1491eb76f1a247ee4e"

RPROVIDES:${PN} += "trace-cmd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
