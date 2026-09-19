SUMMARY = "Extra Plug-Ins for ALSA Library"
DESCRIPTION = "This is a meta package installing a few sub-packages for extra plug-ins \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.12"

RPM_NAME = "alsa-plugins-1.2.12-1.16.aarch64.rpm"
RPM_HASH = "1d9b52dcc588671c688b322bd3be7c1d51b753b3881ac760659de061f2446eac3c1d9775a239048cff31ee63268c7498b6043dab7de45943ef3c3c50a2eaec60"

RPROVIDES:${PN} += "alsa-plugins"

RDEPENDS:${PN} += "alsa-plugins-speexrate \
alsa-plugins-upmix"

inherit rpm
