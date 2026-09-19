SUMMARY = "IBM's TPM 2.0 TSS headers"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS C header files"
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "ibmtss-devel-2.4.1-2.5.aarch64.rpm"
RPM_HASH = "364b624440f38aee8347455f54fb085cc05bf459a19e762e7b03b822b012168261ce99dd1a789c239c51fe58b44bd5f5a2528910a34ed1b271ecd7744ee5bdbd"

RPROVIDES:${PN} += "ibmtss-devel"

RDEPENDS:${PN} += "ibmtss \
libibmtss2"

inherit rpm
