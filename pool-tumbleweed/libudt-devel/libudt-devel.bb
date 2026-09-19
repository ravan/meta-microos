SUMMARY = "Development files for the UDP-based Data Transfer Protocol library"
DESCRIPTION = "UDT is a reliable UDP-based application level data transport protocol \
for distributed data intensive applications over wide area high-speed \
networks. UDT uses UDP to transfer bulk data with its own reliability \
control and congestion control mechanisms. The new protocol can \
transfer data at a much higher speed than TCP does. UDT is also a \
highly configurable framework that can accommodate various congestion \
control algorithms. \
 \
This package provides the files for developing applications to use UDT."
LICENSE = "BSD-3-Clause"

PV = "4.11"

RPM_NAME = "libudt-devel-4.11-1.33.aarch64.rpm"
RPM_HASH = "75bb3e33f0aad25bb551b1f48c60c7ac3b1993b61897920fef65c05e1395390272c05fc401730b0570b39835e50578bdea40348d050c60f222d22f0d012d87f4"

RPROVIDES:${PN} += "libudt-devel \
udt-devel"

RDEPENDS:${PN} += "libudt0"

inherit rpm
