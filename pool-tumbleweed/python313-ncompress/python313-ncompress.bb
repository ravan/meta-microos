SUMMARY = "LZW compression and decompression in Python and C++"
DESCRIPTION = "LZW compression and decompression in Python and C++. \
 \
Ported with minimal changes from the (N)compress CLI tool."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python313-ncompress-1.0.2-1.5.aarch64.rpm"
RPM_HASH = "e46da3bee63a762489700caae4d974829cdee81ac21c72c534059f85bc21452dc9aa9aee6f76d21e9ade1005e8a156a65910597e182588eae777a6fcd80b84d2"

RPROVIDES:${PN} += "python3-ncompress \
python3.13dist-ncompress \
python313-ncompress \
python3dist-ncompress"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
