SUMMARY = "Accessibilty tools helper library, used e.g. by screen readers"
DESCRIPTION = "This library is used when writing accessibility clients such as screen readers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "libqaccessibilityclient-qt6-0-0.6.0-1.9.aarch64.rpm"
RPM_HASH = "a9f3900b0a0afd09191f138d8ae7ead12bc6ea12c4eeda61119fd9e78bd38a317e32759dc882d765678818bb90d40419bbcf656e8f47f344cfdce37694d7cdaf"

RPROVIDES:${PN} += "libqaccessibilityclient-qt6-0 \
libqaccessibilityclient-qt6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
at-spi2-core \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libqaccessibilityclient-qt6 \
libstdc++.so.6"

inherit rpm
