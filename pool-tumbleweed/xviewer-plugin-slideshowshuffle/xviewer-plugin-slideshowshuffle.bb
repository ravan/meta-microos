SUMMARY = "Xviewer slideshowshuffle plugin"
DESCRIPTION = "xviewer Slideshow Shuffle plugin"
LICENSE = "GPL-2.0-or-later"

PV = "3.4.3"

RPM_NAME = "xviewer-plugin-slideshowshuffle-3.4.3-1.2.aarch64.rpm"
RPM_HASH = "7a00c3ce369102fa2eab7ec2edeaf90c8db5144a60a09642612b1e4ede4d87e0f2fddf3557c943cf4062f3052d1d14c8b6c8ff90092d189701bb0a20c2ca2edf"

RPROVIDES:${PN} += "xviewer-plugin-slideshowshuffle"

RDEPENDS:${PN} += "xviewer-plugins-data"

inherit rpm
