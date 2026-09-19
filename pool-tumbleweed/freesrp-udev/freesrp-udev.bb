SUMMARY = "Udev rules for FreeSRP"
DESCRIPTION = "Udev rules for FreeSRP SDR hardware"
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-udev-0.3.0-2.9.aarch64.rpm"
RPM_HASH = "1cac7bf3f969d7c11b2ade69a6500d706779ae6541d58adca8f82c2c738354218641dd89528f961bdf9a02038bef9555d2e89f2c3e07ee556f4b8afd7dd099ca"

RPROVIDES:${PN} += "freesrp-udev"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
