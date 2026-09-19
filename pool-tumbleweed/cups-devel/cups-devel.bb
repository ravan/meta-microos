SUMMARY = "Development Environment for CUPS"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. \
 \
This subpackage contains the header files for developing applications \
that want to make use of libcups for adding print support."
LICENSE = "Apache-2.0"

PV = "2.4.19"

RPM_NAME = "cups-devel-2.4.19-3.1.aarch64.rpm"
RPM_HASH = "96ba69705297bb8f8e96d86580362a3f8d9850ffc5501101d4eccb7f476a678423bef934da3eadd7e5f8a376ad9fa580cf8c268dd2791b0a58752d9ee7da51c7"

RPROVIDES:${PN} += "cups-devel \
pkgconfig-cups"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cups-rpm-helper \
glibc-devel \
libcups2 \
libcupsimage2 \
pkgconfig-avahi-client \
pkgconfig-gnutls"

inherit rpm
