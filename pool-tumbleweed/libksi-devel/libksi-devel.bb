SUMMARY = "Development files for the libksi package"
DESCRIPTION = "LibKSI - Keyless Signature Infrastructure GuardTime client library \
The libksi-devel package contains the header files and libraries \
needed to develop applications using libksi."
LICENSE = "Apache-2.0"

PV = "3.21.3087"

RPM_NAME = "libksi-devel-3.21.3087-1.8.aarch64.rpm"
RPM_HASH = "74617c8a5a7cd06ed611644b985eb051a6a817a1dac1568e0e6004845e128d56c37091c9eadc2cf6a2cb02c0c11ed759bd8be8f6fbbe8e07f65c07f79dcc19fd"

RPROVIDES:${PN} += "libksi-devel \
pkgconfig-libksi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libksi13"

inherit rpm
