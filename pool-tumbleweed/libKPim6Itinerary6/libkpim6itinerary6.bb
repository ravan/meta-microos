SUMMARY = "Data model and extraction system for travel reservations"
DESCRIPTION = "Kitinerary is a library which provides a data model and a system to extract \
information from travel reservations. The model can then be reused in other \
applications. \
This package contains the kitinerary library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Itinerary6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c5f5c360331f0996982aae54326224da653b0e9b864b5ed0cdb16f036915c8da71ae83db97a9d13b3b43d9dc96142117a7b43b4733b3aad5f012c7d7504ac238"

RPROVIDES:${PN} += "libKPim6Itinerary.so.6 \
libKPim6Itinerary6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kitinerary \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6Contacts.so.6 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libKF6Mime.so.6 \
libKPim6PkPass.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libZXing.so.4 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libphonenumber.so.9 \
libpoppler.so.162 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
