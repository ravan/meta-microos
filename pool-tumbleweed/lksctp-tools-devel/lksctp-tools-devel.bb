SUMMARY = "Development files for SCTP (Stream Control Transmission Protocol)"
DESCRIPTION = "This package contains the SCTP development libraries and C header \
files. \
 \
SCTP (Stream Control Transmission Protocol) is a message oriented, \
reliable transport protocol, with congestion control, support for \
transparent multi-homing, and multiple ordered streams of messages."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.21"

RPM_NAME = "lksctp-tools-devel-1.0.21-1.8.aarch64.rpm"
RPM_HASH = "c992a69e14cf75d43fe91d00b386b7b57b6ec675a99ee89d4748828c444b2c17d4d6c491dce8942b482cf825554805348f6cb0b07d18bc7f8be32c226d4f2776"

RPROVIDES:${PN} += "lksctp-tools-devel \
pkgconfig-libsctp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
lksctp-tools"

inherit rpm
