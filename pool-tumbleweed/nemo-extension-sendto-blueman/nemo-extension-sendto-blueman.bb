SUMMARY = "A sendto integration for Nemo"
DESCRIPTION = "This package add sendto integration for Nemo."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "nemo-extension-sendto-blueman-2.4.6-1.5.noarch.rpm"
RPM_HASH = "74eee959ae376718a2a6132ae9848cd2b4705795f578af30d1eaee42fd0491001cc51df419f0e5dbfd90ec7d71988bbabb544adf2792a23245d1b54b9328e119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-GObject \
typelib-Gio \
typelib-Nemo"

inherit rpm
