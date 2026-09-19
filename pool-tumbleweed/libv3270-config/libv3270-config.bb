SUMMARY = "Configuration files for the 3270 Virtual Terminal library"
DESCRIPTION = "Originally designed as part of the pw3270 application, this package provides the configuration files required to libv3270."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20241211"

RPM_NAME = "libv3270-config-5.5.0+git20241211-2.8.noarch.rpm"
RPM_HASH = "922c54c96558e6cf5cec78fda0373dd44c57e47b5ff5a7cfdd2f56bbb0420143b123121572f62ca698771c6eb4bf6a88602c90f254bed55291d840debcc52597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libv3270-config \
libv3270-config"

RDEPENDS:${PN} += "libv3270-5-5"

inherit rpm
