SUMMARY = "Fast BPE tokeniser for use with OpenAI's models"
DESCRIPTION = "Fast Byte Pair Encoding (BPE) tokeniser for use with OpenAI's models."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-tiktoken-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "06890a091cf57bf10e9101d0384fde0f3d9db8423766d85307e578223427b63ab68be61d6adc7a35af2ce29a06999c498dc8805c400756e4f2c4fff9b0a3534b"

RPROVIDES:${PN} += "python3.14dist-tiktoken \
python314-tiktoken \
python3dist-tiktoken"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-regex \
python314-requests"

inherit rpm
