SUMMARY = "Ceph ZBC handler for tcmu-runner"
DESCRIPTION = "This package contains the Ceph RADOS ZBC disc emulation, using a \
file backstore in tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "tcmu-runner-handler-zbc-1.6.2-4.6.aarch64.rpm"
RPM_HASH = "dff6a2714be918d132b033379c3c6f963a645ec38d281006671be2c7b5587a630410decb2772d253b9cd937dda9fdeaa4769b4ca51f443207089b625208fdd80"

RPROVIDES:${PN} += "tcmu-runner-handler-zbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcmalloc.so.4 \
tcmu-runner"

inherit rpm
