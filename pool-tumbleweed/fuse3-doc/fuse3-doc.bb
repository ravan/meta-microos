SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.18.3"

RPM_NAME = "fuse3-doc-3.18.3-1.1.aarch64.rpm"
RPM_HASH = "5c04149714fec890fada6e09f80c6a504bcbbe3e5f6511f3bf86866e3d9dc4ad4b39596eb19028108108a054bc3d3672cc9a6c21add6ee1a0c39263a6e4ef5ff"

RPROVIDES:${PN} += "fuse3-doc"

RDEPENDS:${PN} += ""

inherit rpm
