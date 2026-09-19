SUMMARY = "Reference C implementation of the Lempel-Ziv Finite State Entropy compressor"
DESCRIPTION = "LZFSE is a Lempel-Ziv style data compression algorithm using Finite State \
Entropy coding. It targets similar compression rates at higher compression \
and decompression speed compared to deflate using zlib. \
 \
This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "lzfse-devel-1.0-3.3.noarch.rpm"
RPM_HASH = "72d6295f4df268b9392d25ea614989e0a07e7c18b099824dac236b919030129b463429e4b35be95613844721faf05e1f24165c828b7c55ac24ad74c1c5c6bd32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lzfse-devel"

RDEPENDS:${PN} += "lzfse"

inherit rpm
