SUMMARY = "Qt 6 port of liblastfm"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your applications."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0git.20250222T104528~81e8f9d"

RPM_NAME = "liblastfm6-1-1.2.0git.20250222T104528~81e8f9d-2.7.aarch64.rpm"
RPM_HASH = "02bff9a92f7ea66dbd3b4d7b0575563f97e423785a212b3940242bad2db10404c671f4831123ca6b70a0794b47a6779e9cedd26cc1e24c808dae15c82a10bb6d"

RPROVIDES:${PN} += "liblastfm-fingerprint6.so.1 \
liblastfm6-1 \
liblastfm6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
