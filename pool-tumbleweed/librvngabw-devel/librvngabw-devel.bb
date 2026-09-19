SUMMARY = "An AbiWord document generator library"
DESCRIPTION = "librvngabw is a library for generating AbiWord documents. It is directly \
pluggable into import filters based on librevenge."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.3"

RPM_NAME = "librvngabw-devel-0.0.3-2.11.aarch64.rpm"
RPM_HASH = "61321bb23069418283a0481083471b52d42c2f657b6065a01de50e93945451e42b9944e8a2a7bacd89d1cbf91464b8a3f92e4f473355b0b2c341d597bf0bb58e"

RPROVIDES:${PN} += "librvngabw-devel \
pkgconfig-librvngabw-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librvngabw-0-0-0 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0"

inherit rpm
