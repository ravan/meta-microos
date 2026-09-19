SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpmcore-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b6f2bade02ad760382e7298d3a3237193d920e17d56f57d030bd4cbfddb8b7b10462ce73cd952eedbd8a1bbfe79d33af97779f0b8dbecf0a819c43bd1183ffd8"

RPROVIDES:${PN} += "kpmcore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkpmcore.so.13 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
