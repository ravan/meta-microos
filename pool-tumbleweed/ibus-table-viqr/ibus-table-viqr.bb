SUMMARY = "The Viqr (Vietnamese) table for ibus-table"
DESCRIPTION = "ibus-table-viqr provides the Viqr (Vietnamese) table for ibus-table. Tiếng Việt \
/ Vietnamese"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-viqr-1.3.21-1.5.noarch.rpm"
RPM_HASH = "e9c58fa7d76fe4713b2044affed43c892deb135fa277d6b0a1cd4a2a455e45a25899f1e36c87a4048b20aa551e2c458233c86c3f275a502aa55f2dadc4d31f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-viqr \
locale-ibus-vi"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
