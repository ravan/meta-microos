SUMMARY = "Synchronous Ethernet (SyncE)"
DESCRIPTION = "synce4l is a software implementation of Synchronous Ethernet (SyncE) according \
to ITU-T Recommendation G.8264. The design goal is to provide logic to \
supported hardware by processing Ethernet Synchronization Messaging Channel \
(ESMC) and control Ethernet Equipment Clock (EEC) on Network Card Interface \
(NIC). \
 \
Application can operate in two mutually exclusive input modes: line or \
external. Both modes are described in next paragraphs. \
 \
The best source selection is done according to ITU-T Recommendations G.781 and \
G.8264. Two network options are supported: option 1 and option 2."
LICENSE = "GPL-2.0-only"

PV = "1.1.2"

RPM_NAME = "synce4l-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "677c5bf2c0f87e342f03b2d29c21d775b321cc7e0675383cd0fbd6ba73967f69974e2d9f7471006fbf5d5d41671f77e2db8ff4cc4b5dd584c62d931b1400e48c"

RPROVIDES:${PN} += "config-synce4l \
synce4l"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
systemd"

inherit rpm
