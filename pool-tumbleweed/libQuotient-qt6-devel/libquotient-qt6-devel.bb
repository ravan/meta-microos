SUMMARY = "Development files for libQuotient"
DESCRIPTION = "The libQuotient devel package contains libraries and header files for \
developing applications that use libQuotient."
LICENSE = "LGPL-2.1-only"

PV = "0.9.6"

RPM_NAME = "libQuotient-qt6-devel-0.9.6-2.3.aarch64.rpm"
RPM_HASH = "202e893c3ee60795108240b265548d4adda8216fd4c229dd13760e188fb8799b5b1e4e8b85c3841e5f08b74e45d7947bb4e2560dd3007508f656cfa75593c882"

RPROVIDES:${PN} += "cmake-QuotientQt6 \
libQuotient-qt6-devel \
pkgconfig-QuotientQt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Olm \
cmake-Qt6Gui \
cmake-Qt6Keychain \
cmake-Qt6Network \
cmake-Qt6Sql \
libQuotientQt6-0-9 \
pkgconfig-openssl"

inherit rpm
