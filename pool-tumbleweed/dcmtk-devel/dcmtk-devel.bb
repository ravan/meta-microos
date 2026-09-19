SUMMARY = "Development files for dcmtk"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using dcmtk."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "3.7.0"

RPM_NAME = "dcmtk-devel-3.7.0-2.4.aarch64.rpm"
RPM_HASH = "d6e2cac0c73ca73982a2c92ae1b7d65b05e8c0cc352b44f50cf812fde782122691d857ff1afd0af41d6182b613825550ea6e978a8cc405257af64b258b002338"

RPROVIDES:${PN} += "cmake-DCMTK \
dcmtk-devel \
pkgconfig-dcmtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdcmtk20 \
pkgconfig-libcrypto \
pkgconfig-libjpeg \
pkgconfig-libopenjp2 \
pkgconfig-libssl \
pkgconfig-libtiff-4 \
pkgconfig-libxml-2.0 \
pkgconfig-sndfile \
pkgconfig-zlib \
tcpd-devel"

inherit rpm
