SUMMARY = "Header files for nng"
DESCRIPTION = "Development and header files for nng (nanomsg next-generation)."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "nng-devel-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "7f12e4ced567dbd9473daa8c89c595383feb1249570b898c6669216460a4f77fbeff1dc8ae70ac12b19699bfebf4c9300e3a91e0df5830ff65e080e004b5bc75"

RPROVIDES:${PN} += "cmake-nng \
nng-devel"

RDEPENDS:${PN} += "libnng1 \
nng-utils"

inherit rpm
