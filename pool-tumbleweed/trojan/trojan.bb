SUMMARY = "An unidentifiable mechanism that helps you bypass Internet censorship"
DESCRIPTION = "Trojan features multiple protocols over TLS to avoid both active/passive \
detections and ISP QoS limitations. \
 \
Trojan is not a fixed program or protocol. It's an idea, an idea that imitating \
the most common service, to an extent that it behaves identically, could help \
you get across the Great FireWall permanently, without being identified ever. We \
are the GreatER Fire; we ship Trojan Horses."
LICENSE = "GPL-3.0-or-later"

PV = "1.16.0"

RPM_NAME = "trojan-1.16.0-3.7.aarch64.rpm"
RPM_HASH = "3e7b6122b3844eae7b0ff1a2e198b0803c3c913fcfe17d16c4a58b889771d92961e64a86f2359666094b7deacf096ae6bb312c844e07d2858d32bd6ac830d52e"

RPROVIDES:${PN} += "config-trojan \
trojan"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libmariadb.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
