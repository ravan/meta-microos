SUMMARY = "Periodic cpu utilization statistics"
DESCRIPTION = "cpustat periodically reports the current CPU utilization of running tasks and \
can optionally report per CPU and per task utilization statistics at the end \
of a run. \
cpustat has been designed and optimized to use a minimal amount of CPU cycles \
to monitor a system hence it is a light weight alternative to traditional \
process monitoring tools such as top."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.15"

RPM_NAME = "cpustat-0.02.15-1.20.aarch64.rpm"
RPM_HASH = "badaf1706e462cc1039a55e5a9219590f27e6ceac63cefef8f2747f52224fc9177157a6823b5dd876b018135260668aef046b999cbfbd194759cfb9dfb3b3382"

RPROVIDES:${PN} += "cpustat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
