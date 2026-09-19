SUMMARY = "Background processes and reattach to them"
DESCRIPTION = "dtach wraps a command in a sort of process container with new \
terminal device and session, allowing to 'detach' from it, \
essentially backgrounding the process, and later re-attach to it, \
similar to the eponymous feature of GNU screen. \
 \
dtach avoids interpreting most of the input and output between attached \
terminals and the program under its control. Though multi display mode (like \
screen -x) is available, different terminal types or even sizes are not \
handled."
LICENSE = "GPL-2.0-or-later"

PV = "0.9+2.748020b"

RPM_NAME = "dtach-0.9+2.748020b-3.5.aarch64.rpm"
RPM_HASH = "43c19e81db925aac2f19fcd186433cdc8ceb45f5c1cfa4fe1e12d5df61f70869645a228fa6c232d5a7acaf18ede7e5e6874179530f5de2f4f5069d0896c73e2b"

RPROVIDES:${PN} += "dtach"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
