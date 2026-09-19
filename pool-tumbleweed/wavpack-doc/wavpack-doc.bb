SUMMARY = "Documentation files for wavpack, an audio compression format"
DESCRIPTION = "WavPack is an open audio compression format providing lossless, high-quality \
lossy, and unique hybrid compression modes. \
 \
This subpackage contains development documentation for applications that \
want to make use of wavpack."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "wavpack-doc-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "31ddfa89b9fb36463cd0636f74913db1f093c960015865bc257daa6bdcbdac68d5ee1503354c6655a96e04cd2dbf0a7a14b8ae34342dae773022ffee30ce06dc"

RPROVIDES:${PN} += "wavpack-doc"

RDEPENDS:${PN} += "wavpack"

inherit rpm
