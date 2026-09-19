SUMMARY = "Auxiliary schema data for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the architecture independent files."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "gweather4-data-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "b5bbcd5e85d2a90e5129416a1a44ce02b2312d333f02a3b50248949b227773cd96a2c33dfd46c23e5f95349d9dc752678be1362f7174a753da77e1891ca6265f"

RPROVIDES:${PN} += "gweather4-data \
libgweather4"

RDEPENDS:${PN} += "libgweather-4-0"

inherit rpm
