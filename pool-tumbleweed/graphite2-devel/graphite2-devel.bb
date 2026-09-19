SUMMARY = "Files for Developing with graphite2"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation. \
 \
This package contains the graphite2 development files."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.15"

RPM_NAME = "graphite2-devel-1.3.15-1.3.aarch64.rpm"
RPM_HASH = "aeb5a2eda5effff8faa414f76d3ebd09bbdee1e46a187ac7c044f1ee8944c7a14b677f56abf57942705669661fff7745f7bff9c5ac67bacf80d8b8c871800928"

RPROVIDES:${PN} += "graphite2-devel \
pkgconfig-graphite2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgraphite2-3"

inherit rpm
