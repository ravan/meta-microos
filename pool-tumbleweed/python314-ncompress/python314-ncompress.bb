SUMMARY = "LZW compression and decompression in Python and C++"
DESCRIPTION = "LZW compression and decompression in Python and C++. \
 \
Ported with minimal changes from the (N)compress CLI tool."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python314-ncompress-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "2e2905fbd47bf20a39ee2ee0b077d22a420ed6e5d4614673206a7aa91e2f70b794f984f18117593dc4fc63dc4bd35ae0f54d46a76d9eaa381982e2bcc84bcaa5"

RPROVIDES:${PN} += "python3.14dist-ncompress \
python314-ncompress \
python3dist-ncompress"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
