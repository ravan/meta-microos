SUMMARY = "Display conflicting names in execution path"
DESCRIPTION = "conflict displays conflicting filenames in your execution path. Unlike the csh \
command which, it displays all of the conflicting (non-alias) executable \
filenames in your path."
LICENSE = "MIT"

PV = "20250930"

RPM_NAME = "conflict-20250930-1.4.aarch64.rpm"
RPM_HASH = "072c04148a5377d2754f4817590fb3939521d6871950d31ce63124f9c0c233f2990c3e1daf67ac6a9d17932fa2955b30e3bde333817c132022f90269af91856c"

RPROVIDES:${PN} += "conflict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
