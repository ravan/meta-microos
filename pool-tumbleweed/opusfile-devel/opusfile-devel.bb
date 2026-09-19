SUMMARY = "Development package for opusfile"
DESCRIPTION = "Files for development with opusfile."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "opusfile-devel-0.12-2.14.aarch64.rpm"
RPM_HASH = "0d2df44d31c0e53a2a1f52f41c8e8665fcf9f2884a5044d26d34b04ef141705df3cc92f643cef7cbd6fe6a323748b0dd8b7ef34ee7276f5301a3caf2014cc424"

RPROVIDES:${PN} += "opusfile-devel \
pkgconfig-opusfile \
pkgconfig-opusurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopusfile0 \
pkgconfig \
pkgconfig-ogg \
pkgconfig-openssl \
pkgconfig-opus \
pkgconfig-opusfile"

inherit rpm
