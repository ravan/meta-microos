SUMMARY = "KIWI - Host system dependencies"
DESCRIPTION = "Host setup helper to pull in all packages required/useful to \
leverage all functionality in KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "3751f77a10925e90f5174b4981f4e9d10096037c4cc6a0043f22fb7447d4d38df20ec13d76224d42eae011c8df242d7e75467a8cc0437c3be7767155177cf036"

RPROVIDES:${PN} += "kiwi-systemdeps"

RDEPENDS:${PN} += "kiwi-systemdeps-bootloaders \
kiwi-systemdeps-containers \
kiwi-systemdeps-containers-wsl \
kiwi-systemdeps-core \
kiwi-systemdeps-disk-images \
kiwi-systemdeps-filesystems \
kiwi-systemdeps-image-validation \
kiwi-systemdeps-iso-media"

inherit rpm
