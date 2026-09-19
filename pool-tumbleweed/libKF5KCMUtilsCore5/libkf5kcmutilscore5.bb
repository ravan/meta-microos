SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "c8b0690510070a3034a53677bba703d7546f751661af089adc6e38c0b6b4c9bbaea4e34c181123ae566da13285a8aa11e4bc3579a015ecfde174f79e3aff31ba"

RPROVIDES:${PN} += "libKF5KCMUtilsCore.so.5 \
libKF5KCMUtilsCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
