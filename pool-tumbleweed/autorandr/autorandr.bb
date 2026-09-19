SUMMARY = "Auto-load and detect display hardware using xrandr"
DESCRIPTION = "Auto-detect the connect display hardware and load the appropriate X11 setup using xrandr"
LICENSE = "GPL-3.0-or-later"

PV = "1.15.0.1709469470"

RPM_NAME = "autorandr-1.15.0.1709469470-2.4.noarch.rpm"
RPM_HASH = "fee13300cf54f047c13019464848b47005062506e41cb37d054e56f93c1b9058e80a5bf5f65dec33b17223f694767c916583f8e16cb360967cb0de146bfce840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autorandr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libinput-tools"

inherit rpm
