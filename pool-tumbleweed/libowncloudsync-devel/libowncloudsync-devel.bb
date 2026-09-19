SUMMARY = "Development files for the ownCloud synchronization library"
DESCRIPTION = "Development files for the ownCloud synchronization library. It \
implements the ownCloud sync algorithm that keeps a local directory \
in sync with the content on your cloud."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "6.0.3"

RPM_NAME = "libowncloudsync-devel-6.0.3-1.6.aarch64.rpm"
RPM_HASH = "2e8254b97f2aa602c7f6889a9fbb673eb9d5cb8069c2f70b75be24d82c0f31748d37e00a7cea8f73b099cda77c9dc6b3a456e48db56815359c64a3ccc8194bfa"

RPROVIDES:${PN} += "cmake-ownCloud \
libowncloudsync-devel"

RDEPENDS:${PN} += "libowncloudsync0"

inherit rpm
