SUMMARY = "Chinese Lunar calendar"
DESCRIPTION = "This is the traditional Chinese calendar application."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-calendar-3.0.1-1.13.aarch64.rpm"
RPM_HASH = "337900333c4ee11bd2e9e886c8fc67a1208e5ee15da579c3ee38da5b0c0a091e9eb5b29b35b2ebecc249982c832c7acd0e924d41124de80ac75f168872f4d291"

RPROVIDES:${PN} += "lunar-calendar"

RDEPENDS:${PN} += "liblunar-calendar-3-0-1"

inherit rpm
