SUMMARY = "Development package for libopusenc"
DESCRIPTION = "Files for development with libopusenc."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "libopusenc-devel-0.3-1.4.aarch64.rpm"
RPM_HASH = "83f2754dadb3cb51ced2c3f5f01b2d485e8c96ad76f329bfe373ebc22e2660164ca12de1679ca96df7cdf926244f7319c3f40a14fdb02bc4ea7b76800872067b"

RPROVIDES:${PN} += "libopusenc-devel \
pkgconfig-libopusenc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopusenc0 \
pkgconfig-opus"

inherit rpm
