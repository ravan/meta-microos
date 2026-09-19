SUMMARY = "KIWI - Core host system dependencies"
DESCRIPTION = "This metapackage installs the necessary system dependencies \
to run KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-core-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "a3c9782f13fbf44f8c93743875750c0843b0d8df5d4c821311dfba3c895c616262c23004ab14ae1f8c542151c848ba382aaafaa84552734212a9a4b63b81a145"

RPROVIDES:${PN} += "kiwi-image-tbz \
kiwi-image-tbz-requires \
kiwi-packagemanager-dnf5 \
kiwi-packagemanager-zypper \
kiwi-systemdeps-core"

RDEPENDS:${PN} += "cpio \
dnf5 \
dnf5-plugins \
lsof \
mtools \
openssl \
rsync \
tar \
zypper"

inherit rpm
