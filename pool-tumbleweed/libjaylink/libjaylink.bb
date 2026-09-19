SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-0.3.1-1.13.aarch64.rpm"
RPM_HASH = "c4228de37c30efb199f9ea32ee493fcef1b8588dde0ff9bfc794274847022e7c50955578957516af9fe69b536d9a66ae5915a6af741dba7347a9a2681beb97f3"

RPROVIDES:${PN} += "libjaylink \
libjaylink0-/usr/lib/udev/rules.d/99-libjaylink.rules"

RDEPENDS:${PN} += "/usr/bin/sh \
udev"

inherit rpm
