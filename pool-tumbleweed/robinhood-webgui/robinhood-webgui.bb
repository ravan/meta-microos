SUMMARY = "Web interface to vizualize filesystems stats"
DESCRIPTION = "Web interface to vizualize filesystems stats. This uses robinhood database \
to display miscelancous user and group stats."
LICENSE = "CECILL-C"

PV = "3.2.0"

RPM_NAME = "robinhood-webgui-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "86eed9a5c25f0a6d89e3f19ee844c2b9b918f8b33e0e583ddb57df094e2d926b2df9d737a4a472ebc15f36e834db1a7c8bebe25e1b60831ed0762a0d26281cd0"

RPROVIDES:${PN} += "config-robinhood-webgui \
robinhood-webgui"

RDEPENDS:${PN} += "apache2 \
group-www \
mod-php-any \
php \
php-mysql \
php-pdo \
user-wwwrun"

inherit rpm
