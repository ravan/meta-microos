SUMMARY = "Calculates distance (qrb) used in Amateur Radio"
DESCRIPTION = "Given two Maidenhead locators, calculates distance (qrb) and azimuth \
Or if called as locator, gives the lat/long of a Maidenhead locator."
LICENSE = "SUSE-Freeware"

PV = "1.3"

RPM_NAME = "wwl-1.3-1.8.aarch64.rpm"
RPM_HASH = "74c6459d8b15c87dec3725544b759770b4c7c6c528a021ee0fd85203b274749110f06054fb4f98509dddc7d79bc46a474d3405d4085a1dd4fa7621e56ff0a9ae"

RPROVIDES:${PN} += "wwl"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
