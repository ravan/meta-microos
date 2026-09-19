SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "Apache-2.0"

PV = "0.3.10"

RPM_NAME = "python314-fastbencode-0.3.10-1.6.aarch64.rpm"
RPM_HASH = "465e3e532ca6e60220dfe7d6967a6b9994a2b45d211d98780b22f80d92b6712aecdd6464eb843e721fe20cd468e625a7158840f87dff7a3830eaae955afe69e2"

RPROVIDES:${PN} += "python3.14dist-fastbencode \
python314-fastbencode \
python3dist-fastbencode"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
