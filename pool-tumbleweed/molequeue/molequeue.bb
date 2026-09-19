SUMMARY = "Desktop integration of high performance computing resources"
DESCRIPTION = "System-tray resident desktop application for abstracting, managing, \
and coordinating the execution of tasks both locally and on remote \
computational resources. \
 \
Features: \
 \
 * Open source distributed under the liberal 3-clause BSD license \
 * Cross platform with nightly builds on Linux, Mac OS X and Windows \
 * Intuitive interface designed to be useful to whole community \
 * Support for local executation and remote schedulers (SGE, PBS, SLURM) \
 * System tray resident application managing queue of queues and job lifetime \
 * Simple, lightweight JSON-RPC 2.0 based communication over local sockets \
 * Qt 5 client library for simple integration in Qt applications"
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-0.9.0-4.3.aarch64.rpm"
RPM_HASH = "6189d19a196625c19f839a94e67d6311b38df897580bc56a503dfbdb33f1f2e7dd3d7abf8b172132dd1912fca47762987949c273f0cbe563d06c4203ad6dc088"

RPROVIDES:${PN} += "molequeue"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libMoleQueueClient.so \
libMoleQueueServerCore.so \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
molequeue-libs0"

inherit rpm
