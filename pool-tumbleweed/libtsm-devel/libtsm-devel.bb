SUMMARY = "Development files for the DEC-VT terminal state machine library"
DESCRIPTION = "TSM is a state machine for DEC VT100-VT520 compatible terminal \
emulators. It can be used to implement terminal emulators, or other \
applications that need to interpret terminal escape sequences. The \
library does no rendering or window management of its own, and does \
not depend on a graphics stack, unlike the similar GNOME libvte. \
 \
This package contains the development headers for the library found \
in libtsm4."
LICENSE = "LGPL-2.1-or-later"

PV = "4.7.1"

RPM_NAME = "libtsm-devel-4.7.1-1.1.aarch64.rpm"
RPM_HASH = "2bf1f737a7224635b462c949c7469c90c659daef7441675a9ae2e02fbb5bc4552e54969c6a59c17c4329fcf5d43961136c6976eb84ea760fc73fb8422e06f8c8"

RPROVIDES:${PN} += "libtsm-devel \
pkgconfig-libtsm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtsm4"

inherit rpm
