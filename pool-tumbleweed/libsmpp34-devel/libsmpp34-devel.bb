SUMMARY = "Development files for the SMPP-3.4 protocol library"
DESCRIPTION = "The library provides the PDU handling of the SMPP-3.4 protocol. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmpp34."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.5"

RPM_NAME = "libsmpp34-devel-1.14.5-1.4.aarch64.rpm"
RPM_HASH = "52f1f86662097d4eda5988cea8d91684961bd421799d19f833fc21b1a74d56a0b0bc30e0fc79b9155f4950aefd5d9be19313ae55c3742f8f0db253548d22cde2"

RPROVIDES:${PN} += "libsmpp34-0-devel \
libsmpp34-devel \
pkgconfig-libsmpp34"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmpp34-1"

inherit rpm
