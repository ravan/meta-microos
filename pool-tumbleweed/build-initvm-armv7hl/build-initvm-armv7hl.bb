SUMMARY = "Virtualization initializer for emulated cross architecture builds"
DESCRIPTION = "This package provides a script for building RPMs for SUSE Linux in a \
chroot or a secure virtualized"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20260505"

RPM_NAME = "build-initvm-armv7hl-20260505-1.3.noarch.rpm"
RPM_HASH = "c3a63646ab285d1ead6356a5d62dc1e16e025d4ee200a5c35d366aafbe85a41b7a6b475f8d920aa30701354e9f137967bf986cb9703876193f219fb19c1413e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-initvm \
build-initvm-armv7hl"

RDEPENDS:${PN} += "build"

inherit rpm
