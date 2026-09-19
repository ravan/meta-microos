SUMMARY = "A portable library for atomic memory operations"
DESCRIPTION = "Provides implementations for atomic memory update operations on a \
number of architectures. This allows direct use of these in reasonably \
portable code. Unlike earlier similar packages, this one explicitly \
considers memory barrier semantics, and allows the construction of code \
that involves minimum overhead across a variety of architectures."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "7.10.0"

RPM_NAME = "libatomic_ops-devel-7.10.0-1.5.aarch64.rpm"
RPM_HASH = "802d2de8cbcf57e00a3837510b55dbdf79a71c7779396825b1a9e62233f25d83ce3c861af102953ce57cc4ecd593c958016ac04a3cc5139ece1a62055675fc9e"

RPROVIDES:${PN} += "libatomic-ops-devel \
pkgconfig-atomic-ops"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
