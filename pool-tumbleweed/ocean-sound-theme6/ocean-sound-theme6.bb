SUMMARY = "Ocean sound theme"
DESCRIPTION = "This package contains the Ocean sound theme for KDE Plasma."
LICENSE = "CC-BY-SA-4.0"

PV = "6.7.5"

RPM_NAME = "ocean-sound-theme6-6.7.5-1.1.noarch.rpm"
RPM_HASH = "1995e8889edcd6abcff5a4401700de73c9ddf67b9131b81de26001154e305fce459fcad1f86fae28bfad6a46b70571af8194edf2d94f0dfb768ea7eaec7c5d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocean-sound-theme6"

RDEPENDS:${PN} += ""

inherit rpm
