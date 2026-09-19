SUMMARY = "Development files for QOAuth"
DESCRIPTION = "QOAuth supports interaction with OAuth-powered network services, \
in the style of Qt libraries. \
 \
This package contains files for developing applications using QOAuth."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "qoauth-qt5-devel-2.0.0-4.8.aarch64.rpm"
RPM_HASH = "bc0983c3329596f81bf4feb6ac76462a2bcf0f2c0a414fd7344e96bd710de2985ed3879400f90e444896a5f99a55b53184df523410831af0ae5c1b9391616e3c"

RPROVIDES:${PN} += "pkgconfig-qoauth \
qoauth-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqoauth2 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network \
pkgconfig-qca2-qt5"

inherit rpm
