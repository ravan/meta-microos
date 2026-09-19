SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.4"

RPM_NAME = "python313-blosc-1.11.4-1.4.aarch64.rpm"
RPM_HASH = "2892ec788cdf69b363997d196ee5cc7344de0d5b19e130ce315472f17110eb8fb15f53f4d2a2655cd6bfa81ab1d6659ef5ce6f213f18fbad4c9aab35b458a0b5"

RPROVIDES:${PN} += "python3-blosc \
python3.13dist-blosc \
python313-blosc \
python3dist-blosc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
python-abi"

inherit rpm
