SUMMARY = "Pack Program"
DESCRIPTION = "Lha is a packer comparable to ZIP (PKZIP), ZOO, and others. It has been \
included for compatibility reasons only. Use GZIP for general archiving \
purposes, because it is the standard for Linux."
LICENSE = "SUSE-Public-Domain"

PV = "1.14.1~git.20230329"

RPM_NAME = "lha-1.14.1~git.20230329-2.5.aarch64.rpm"
RPM_HASH = "d50a9cdfaaeb2c8034044682eb57439e155075af1ec4689cc0e1ceddac3949a2e116138377f1c8a7110765b025d732a847530c76bfdc9bf4a33fb8a264f09b5d"

RPROVIDES:${PN} += "lha"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
