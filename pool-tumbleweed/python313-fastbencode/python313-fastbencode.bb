SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "Apache-2.0"

PV = "0.3.10"

RPM_NAME = "python313-fastbencode-0.3.10-1.6.aarch64.rpm"
RPM_HASH = "a7fa00b4050d7b051eef9c9594831405e28bff219ab2a08cbab55d2766afe8a53140129d094dbbef2e81962767941e6bd3978b795c6cdf6e7c0ce5998befcce3"

RPROVIDES:${PN} += "python3-fastbencode \
python3.13dist-fastbencode \
python313-fastbencode \
python3dist-fastbencode"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
