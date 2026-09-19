SUMMARY = "Udev rules for Airspy SDR"
DESCRIPTION = "Udev rules for Airspy SDR"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "airspy-udev-1.0.10-3.5.aarch64.rpm"
RPM_HASH = "c1d75ae975e00b197c3bd19911f612a786ee5fd1723c0b6fa458bb785f2cd03bd4b55295d14289c4c9d2226cfc98aa1080d12702f36b2d3eb487e30b750da256"

RPROVIDES:${PN} += "airspy-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
