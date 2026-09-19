SUMMARY = "KIO slave to access ISO images"
DESCRIPTION = "KIO slave to access ISO images like zip- or tar.gz-archives in your \
file-browser."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "kio_iso-2.9.0-1.6.aarch64.rpm"
RPM_HASH = "9662aa82b9573901a8013a92b07991212da499a1fcfb72f7b787f2c9c17926e51c3a5e9d113f83043561ad6114433fc451a03b3e47225027a89ddfa05864d3e5"

RPROVIDES:${PN} += "config-kio-iso \
kde4-kio-iso \
kio-iso"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
