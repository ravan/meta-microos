SUMMARY = "Daemon to prevent hard disk head parking in rotational media"
DESCRIPTION = "Modern rotational hard disks have a misfeature involving the regular \
automatic unloading of the heads, measurable by the SMART attribute \
'Load_Cycle_Count', that causes latency on wake-up, and while the \
manufacturers sell this as 'green', it is believed to cause reduced \
hard disk life. \
 \
The parkverbot daemon will periodically issue small read requests in \
order to keep the hardware from going to its head-unloaded idle \
state."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "parkverbot-1.6-1.4.aarch64.rpm"
RPM_HASH = "312a86c1b0bc4c8acdff80454f7ce1501f5a3cd3aa8ca40ce63a65196fb20a85d410e7b2b7a2b09deac69ff9f8c8d258cc8a3605a732e378ef715f0719eb4e6d"

RPROVIDES:${PN} += "parkverbot"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libHX.so.43 \
libc.so.6"

inherit rpm
