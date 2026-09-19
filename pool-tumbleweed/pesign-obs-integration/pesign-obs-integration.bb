SUMMARY = "Macros and scripts to sign the kernel and bootloader"
DESCRIPTION = "This package provides scripts and rpm macros to automate signing of the \
boot loader, kernel and kernel modules in the openSUSE Buildservice."
LICENSE = "GPL-2.0-or-later"

PV = "10.2+git20260731.2d86941"

RPM_NAME = "pesign-obs-integration-10.2+git20260731.2d86941-2.1.aarch64.rpm"
RPM_HASH = "577473999958d704f7ebdddb9798518808f9aa7dbecf1dc184acc639e1d8054619f90a1bbab07e70076ada9fd6f5e533035c452354ff478da2fbebf55a44b7e6"

RPROVIDES:${PN} += "pesign-obs-integration"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
efitools \
fipscheck \
mozilla-nss-tools \
openssl \
pesign \
suse-module-tools"

inherit rpm
