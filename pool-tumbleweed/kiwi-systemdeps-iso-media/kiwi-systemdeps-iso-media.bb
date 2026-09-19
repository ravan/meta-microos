SUMMARY = "KIWI - host requirements for live and install iso images"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host to build live and install iso images."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-iso-media-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "015dd45273e6885221a3252ebd6130679fd8ffd766a6b0cb7cb789a6700c4f7786f83a5bedf52b8d22eccfa4e3979c50ae5f36d7e120ed56104345b3cd86f224"

RPROVIDES:${PN} += "kiwi-image-iso \
kiwi-image-iso-requires \
kiwi-systemdeps-iso-media"

RDEPENDS:${PN} += "checkmedia \
kiwi-systemdeps-bootloaders \
kiwi-systemdeps-core \
kiwi-systemdeps-filesystems \
xorriso"

inherit rpm
