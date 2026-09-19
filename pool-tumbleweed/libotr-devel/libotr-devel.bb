SUMMARY = "Include files and development libraries"
DESCRIPTION = "Headers and development libraries for libotr"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.1.1"

RPM_NAME = "libotr-devel-4.1.1-4.12.aarch64.rpm"
RPM_HASH = "f0de45d69d4f95c95dbd4acfd194ebb1748a125a74c36a26129f2940e37a701b2e0d25b02af6a304be1876ad481c40833a37cb7319474305ea98ef6c5d47db15"

RPROVIDES:${PN} += "libotr-devel \
pkgconfig-libotr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcrypt-devel \
libotr5"

inherit rpm
