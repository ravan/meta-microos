SUMMARY = "Files needed for NFC development"
DESCRIPTION = "Files needed to develop applications for the NFC stack."
LICENSE = "GPL-2.0-only"

PV = "0.20"

RPM_NAME = "neard-devel-0.20-1.3.aarch64.rpm"
RPM_HASH = "9540de177a69c36de165b42274a19b5995c7a990aa9c054e58f1053939c17b99b8b43be29ef747b259d9bb3c8e589a11886c325ba8da9851fd7c248c52cae27a"

RPROVIDES:${PN} += "neard-devel \
pkgconfig-neard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-libnl-3.0 \
pkgconfig-libnl-genl-3.0"

inherit rpm
