SUMMARY = "Fast BPE tokeniser for use with OpenAI's models"
DESCRIPTION = "Fast Byte Pair Encoding (BPE) tokeniser for use with OpenAI's models."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python313-tiktoken-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "322e9b55e4c74de20e4bd929beed7456070af62e3b6a69a70e708ed384843e06959729a38e0342021483173010237616b2700b518919f9ba681bb1b621a3b1c8"

RPROVIDES:${PN} += "python3-tiktoken \
python3.13dist-tiktoken \
python313-tiktoken \
python3dist-tiktoken"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-regex \
python313-requests"

inherit rpm
