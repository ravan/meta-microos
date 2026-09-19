SUMMARY = "Bulk Email and URL extraction tool"
DESCRIPTION = "bulk_extractor is a C++ program that scans a disk image, a file, or a \
directory of files and extracts useful information without parsing the \
file system or file system structures. The results are stored in feature \
files that can be easily inspected, parsed, or processed with automated \
tools. bulk_extractor also created a histograms of features that it finds, \
as features that are more common tend to be more important."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "bulk_extractor-2.1.1-1.4.aarch64.rpm"
RPM_HASH = "6e0c24a511381408444ae503ad95ebd42117379e6e3c66394b0dfe0126b1a8be70fa07a3d02747c023281a10aa6e49910ad1e06afab591ed919c894cd8ec94f5"

RPROVIDES:${PN} += "bulk-extractor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libewf.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libre2.so.11 \
libstdc++.so.6 \
libz.so.1 \
sleuthkit"

inherit rpm
