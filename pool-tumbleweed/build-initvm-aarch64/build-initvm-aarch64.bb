SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-initvm-aarch64-20260505-1.3.noarch.rpm"
RPM_HASH = "1c0e8dbe442ff9be5b9c231b62d9305638e27aa6c71bc24ae45ab0e34ae6d46589c0acb63ab56e625120a912238b118e34260a9fd4f7d639756e8f5e5c5db783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm \
build-initvm-aarch64"

RDEPENDS:${PN} += "build"

inherit rpm
