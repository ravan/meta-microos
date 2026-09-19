SUMMARY = "Include files to develop for libzen"
DESCRIPTION = "Include files and mandatory libraries to develop \
for libzen."
LICENSE = "Zlib"

PV = "0.4.41"

RPM_NAME = "libzen-devel-0.4.41-1.11.aarch64.rpm"
RPM_HASH = "2400917f2001d9029a01bd27c1da9c30985c4524f6c6700d2190fc1f1d6a4aba660cbeaa0831a262ec1b75d66ecfe7edfd9a558fda28a8cf2a393f1532aa57c2"

RPROVIDES:${PN} += "libzen-devel \
pkgconfig-libzen"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzen0"

inherit rpm
