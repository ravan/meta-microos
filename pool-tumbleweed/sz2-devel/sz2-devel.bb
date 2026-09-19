SUMMARY = "Development files for libsz2"
DESCRIPTION = "Header files for libsz2, a drop-in replacement for the \
SZIP library (http://www.hdfgroup.org/doc_resource/SZIP)."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "sz2-devel-1.1.7-1.3.aarch64.rpm"
RPM_HASH = "3143e28f882a1cbcdae1f04b671e12bad705cf291bb0d82b5208608136d75e07bccb9a8cc8360537370a0094777ac4d6501d1f81f2955bb661896349e3adc286"

RPROVIDES:${PN} += "libsz2-devel \
sz2-devel"

RDEPENDS:${PN} += "libaec-devel \
libsz2"

inherit rpm
