SUMMARY = "HA Reusable Cluster Resource Scripts"
DESCRIPTION = "A set of scripts to interface with several services to operate in a \
High Availability environment for both Pacemaker and rgmanager \
service managers."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "4.18.0+git94.6c50a9b"

RPM_NAME = "resource-agents-4.18.0+git94.6c50a9b-1.1.aarch64.rpm"
RPM_HASH = "6d98852930aa6836783768e75a2872c3519cb818b2b45fa4e749ad077cda09d5cc9f8a32baaa08df94f0f599957b348876f9241c70eaf50fd6d70099d66759ad"

RPROVIDES:${PN} += "aws-vpc-move-ip \
config-resource-agents \
heartbeat-resources \
pkgconfig-resource-agents \
resource-agents \
resource-agents-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/logger \
/usr/bin/pkg-config \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libqb.so.100"

inherit rpm
