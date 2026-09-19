SUMMARY = "System user and group qemu"
DESCRIPTION = "This package provides the system account and group 'qemu'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-qemu-20250822-2.3.noarch.rpm"
RPM_HASH = "e51ae6fa4ffe1035e63c51d21987c3b6df9dfb18e6d0187a40b9e75d62282ef43f94ce30f8bccca27c91c278af06e0d997b5b0d1ccd1d1764b39b7cc1915ddf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-qemu \
system-user-qemu \
user-qemu"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
sysuser-shadow"

inherit rpm
