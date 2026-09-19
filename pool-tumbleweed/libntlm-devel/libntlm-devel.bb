SUMMARY = "Development files for libntlm, an NTLMv1 authentication library"
DESCRIPTION = "Libntlm provides routines to manipulate the structures used for the \
client end of Microsoft NTLMv1 authentication. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libntlm."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libntlm-devel-1.8-2.3.aarch64.rpm"
RPM_HASH = "b05bffbe455bd3357324cdc95cc3f281bd0cbbb97fa3e4a7930547610311b1082be745535d08bcd932297e38c234af429fe710be9acfa77dccd90d85a0f7667e"

RPROVIDES:${PN} += "libntlm-devel \
pkgconfig-libntlm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntlm0"

inherit rpm
