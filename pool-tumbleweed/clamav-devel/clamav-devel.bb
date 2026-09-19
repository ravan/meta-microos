SUMMARY = "Development files for libclamav, an antivirus engine"
DESCRIPTION = "ClamAV is an antivirus engine designed for detecting trojans, \
viruses, malware and other malicious threats. \
 \
This subpackage contains header files for developing applications \
that want to make use of libclamav."
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "clamav-devel-1.5.4-2.1.aarch64.rpm"
RPM_HASH = "a4bc9c9090719984e369c8af5a55226f9d9593794ea8f8b83551d6eb80138e7a6f0db39a1e50109e87c2a69db252d3d6358d61d2a917e668083ea13cbd511f23"

RPROVIDES:${PN} += "clamav-devel \
pkgconfig-libclamav"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclamav12 \
libfreshclam4"

inherit rpm
