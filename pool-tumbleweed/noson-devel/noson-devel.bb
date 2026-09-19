SUMMARY = "Development files for noson library"
DESCRIPTION = "Development files for noson library. The noson library supports basic features \
to browse music index and control playback in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "noson-devel-2.10.2-1.13.aarch64.rpm"
RPM_HASH = "d76a2f41b01c2d433431f56ba60b0d1531a3b4ee6373d0e8579f0b6b351f338a91789a92f59c2a4e580a42cdb21e45a9454bd4b15fcfc724919ccd75c4f58d9d"

RPROVIDES:${PN} += "cmake-noson \
noson-devel \
pkgconfig-noson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnoson2"

inherit rpm
