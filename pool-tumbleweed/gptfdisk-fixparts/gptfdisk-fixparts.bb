SUMMARY = "A tool for repairing certain types of damage to MBR disks"
DESCRIPTION = "A program that corrects errors that can creep into MBR-partitioned \
disks. Removes stray GPT data, fixes mis-sized extended partitions, \
and enables changing primary vs. logical partition status. Also \
provides a few additional partition manipulation features."
LICENSE = "GPL-2.0-only"

PV = "1.0.10"

RPM_NAME = "gptfdisk-fixparts-1.0.10-1.9.aarch64.rpm"
RPM_HASH = "f5c05fe82e9ffba2dd8fa69340a38657b668f25361884c4187436105f21832ff5d3419606e8191dd1a96be28847a58ae3005616c8d3807b206e47116c129aa0b"

RPROVIDES:${PN} += "gptfdisk-fixparts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
