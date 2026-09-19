SUMMARY = "A wire protocol for IPC"
DESCRIPTION = "Hyprwire is a wire protocol, and its eponymous implementation. This \
is essentially a method for processes to talk to each other."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "hyprwire-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "5502d2a35ce3ee499dc762e647719ba96ed694614b8a44de4cf21e339d44954c78aba7cd2905e67956098c3289be35f70e14c8dde30f4bc92dc4cb9be4a13c61"

RPROVIDES:${PN} += "hyprwire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
