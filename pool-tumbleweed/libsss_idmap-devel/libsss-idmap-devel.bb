SUMMARY = "Development files for the FreeIPA idmap library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "libsss_idmap-devel-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "a8b062c52060b5ce49ac5ab12736068e7c075cda375839522b3d83381e590c52d2e334ba33d59422109e5fdcbb3f12669248b983d78b37f0ea9d2755317086bd"

RPROVIDES:${PN} += "libsss-idmap-devel \
pkgconfig-sss-idmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-idmap0"

inherit rpm
