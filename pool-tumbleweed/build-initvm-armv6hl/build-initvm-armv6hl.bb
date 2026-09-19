SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-initvm-armv6hl-20260505-1.3.noarch.rpm"
RPM_HASH = "70ac9fa527a5c94b1cb48f25c3cd044c29738e02785f0bac65cf6a5378af27c2d4965a08cb6f4d0976918c0d1d1a95c9e460f29c3eced242f149342c343ec200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm \
build-initvm-armv6hl"

RDEPENDS:${PN} += "build"

inherit rpm
