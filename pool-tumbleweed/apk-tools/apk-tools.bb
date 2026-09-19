SUMMARY = "Alpine package manager"
DESCRIPTION = "Alpine Package Keeper (apk) is a package manager originally built for \
Alpine Linux, but now used by several other distributions as well."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "apk-tools-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "0cba616951b2250c46535a659c329b6e9d1075fa92c1ccb0f38cec60726ff898ddc246077316d341dd4790a26073efbe4a58f59338381993443c62345bf86db7"

RPROVIDES:${PN} += "apk-tools \
bundled-libfetch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapk.so.3.0.0 \
libc.so.6 \
libz.so.1 \
python-abi"

inherit rpm
