SUMMARY = "Radiance Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk3-metatheme-radiance-20.10-2.10.noarch.rpm"
RPM_HASH = "d7075a8b70bd57fa6e93cd224b32a5a76bf2518adcc7fa45f7078c1a5c925323e6998b9f1e0f76c5c9bc61d6a8f9c6f7957aa23392ddead9d0f6c1e35f27da2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-radiance"

RDEPENDS:${PN} += "metatheme-radiance-common"

inherit rpm
