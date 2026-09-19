SUMMARY = "The Ultimate Packer for eXecutables"
DESCRIPTION = "UPX is a compressor for several different executable formats. \
Programs receive a stub that makes them self-runnable. When run, \
decompression either happens in memory in-place if possible, or to a \
temporary file, the latter of which does not support setuid programs, \
or the proper name in argv[0]."
LICENSE = "Apache-2.0-with-LLVM-exception & GPL-2.0-or-later & BSD-4-Clause & BSD-3-Clause & MIT & Zlib & (CPL-1.0 | LGPL-2.1-only)"

PV = "5.2.1"

RPM_NAME = "upx-5.2.1-1.1.aarch64.rpm"
RPM_HASH = "80f123e79dcac5fa5772c45857ca090e65e301ca072036ec021b2177be3267727c3c8a619a9d92551112d91dd4672f594333bb1bcb374c4da2f7b62913d3cbc1"

RPROVIDES:${PN} += "upx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
