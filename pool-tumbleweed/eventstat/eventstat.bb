SUMMARY = "Kernel event states monitoring tool"
DESCRIPTION = "Eventstat periodically dumps out the current kernel event state.It keeps track \
of current events and outputs the change in events on each output update. \
The tool requires sudo to run since it needs to write to /proc/timer_stats to \
start and stop the event monitoring."
LICENSE = "GPL-2.0-or-later"

PV = "0.06.00"

RPM_NAME = "eventstat-0.06.00-1.10.aarch64.rpm"
RPM_HASH = "10f12d2a55663e7f5899ca37fefb81d6204555fe75bed827140062409aedede1ddc22643c88f24fc7742c361f766c15a41d7741dc932c0359f8ab1641ff2f4c4"

RPROVIDES:${PN} += "eventstat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
