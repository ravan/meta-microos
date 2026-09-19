SUMMARY = "Development files of the FAAD 2 AAC decoder"
DESCRIPTION = "FAAD2 is a HE, LC, MAIN and LTP profile, MPEG2 and MPEG-4 AAC decoder. \
FAAD2 includes code for SBR (HE AAC) decoding. \
Header files and development documentation for libfaad."
LICENSE = "GPL-2.0-or-later"

PV = "2.11.3"

RPM_NAME = "faad2-devel-2.11.3-1.1.aarch64.rpm"
RPM_HASH = "c6b1d1187e555b41130fb21e0d06383334306e532677c3712198167ff97851576f98092e5bc4fc7296f4b68003448d229c03a8fc6a64dce491c9945fcfe8524b"

RPROVIDES:${PN} += "faad2-devel \
libfaad-devel \
libfaad2-devel \
pkgconfig-faad2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfaad-drm2 \
libfaad2"

inherit rpm
