SUMMARY = "Early boot daemon to monitor memory pressure and react to low memory"
DESCRIPTION = "The Low Memory Monitor is an early boot daemon that will monitor memory \
pressure information coming from the kernel, and, when memory pressure means \
that memory isn't as readily available and would cause interactivity problems, \
would: \
* send D-Bus signals to user-space applications when memory is running low, \
* if configured to do so and memory availability worsens, activate the kernel's \
  OOM killer."
LICENSE = "GPL-3.0-only"

PV = "2.1"

RPM_NAME = "low-memory-monitor-2.1-3.21.aarch64.rpm"
RPM_HASH = "9e4deed4d647d059d35a8013df20ccf1aa8422dc11e2550e6afb781ebeafcfc9abbc2d7825a39c7e811a292feffeb69d29b1b9938322165bc9877d0ab83409bb"

RPROVIDES:${PN} += "low-memory-monitor"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
systemd"

inherit rpm
