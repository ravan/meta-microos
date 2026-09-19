SUMMARY = "File archiver designed for speed"
DESCRIPTION = "qpress is a portable file archiver using QuickLZ and designed to utilize \
fast storage systems to their max. It's often faster than file copy \
because the destination is smaller than the source. A few features: \
 \
* multiple cores, reaching upto 1.1 Gbyte/s in-memory compression on a \
  quad core i7 \
* 64-bit file sizes and tested with terabyte sized archives containing \
  millions of files and directories \
* pipes and redirection and *nix-like behaviour for scripting and \
  flexibility \
* Adler32 checksums to ensure that decompressed data has not been corrupted \
* data recovery of damaged archives with 64 Kbyte grannularity"
LICENSE = "GPL-1.0-only & GPL-2.0-only & GPL-3.0-only"

PV = "20260802"

RPM_NAME = "qpress-20260802-1.1.aarch64.rpm"
RPM_HASH = "3842b535f5835103e7f240c0b75801232b808405e7f54766ebafbc61086bae971d4eaf1e3bc06cb5ffa232619ee5e49746e5645c60b6360755789058dbb4cedf"

RPROVIDES:${PN} += "qpress"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
