SUMMARY = "Kernel Samepage Merging services"
DESCRIPTION = "Kernel Samepage Merging (KSM) is a memory-saving de-duplication feature, that \
merges anonymous (private) pages (not pagecache ones). \
 \
This package provides a service file for starting and stopping KSM."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ksm-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "a0a5aedf6411e2b08568ccf871ea6e82624764659b22e9e25a2a5a59a36fc3c4560f39b49fe74497d5d8835059b4d157407496b489a68f502636613e6df59b1f"

RPROVIDES:${PN} += "qemu-ksm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
