SUMMARY = "System Information GAthering"
DESCRIPTION = "SIGA stands for System Information GAthering. It collects various \
system information and outputs it in HTML or ASCII format. Since it \
needs root permissions, you will be asked for the root password. It is \
very handy as an information source during installation support phone \
calls."
LICENSE = "GPL-2.0+"

PV = "12.101"

RPM_NAME = "siga-12.101-9.24.noarch.rpm"
RPM_HASH = "cf37013d6b0ad6632f5fba1d238d3e0b8f00acb02206f186f6dd5e51424735ae0642d9a381c230e6dc5fdc13f8ce056ee1410673849400ef59b0028a27dff87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "siga"

RDEPENDS:${PN} += "/usr/bin/sh \
w3m"

inherit rpm
