SUMMARY = "Web Console for Linux servers"
DESCRIPTION = "The Cockpit Web Console enables users to administer GNU/Linux servers using a \
web browser. \
 \
It offers network configuration, log inspection, diagnostic reports, SELinux \
troubleshooting, interactive command-line sessions, and more."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-365-2.1.aarch64.rpm"
RPM_HASH = "a62379f879165a24c9137143c5fd44d666fafd1e111b78745988095f61de54dd73c66b7f04a87eae33443a34208c2680d80993fab9c9203c7b84fd24ac9a7653"

RPROVIDES:${PN} += "cockpit"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-system \
cockpit-ws"

inherit rpm
