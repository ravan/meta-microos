SUMMARY = "A wayland clipboard manager with support for multimedia"
DESCRIPTION = "A wayland clipboard manager with support for multimedia"
LICENSE = "GPL-3.0-only"

PV = "0.7.0"

RPM_NAME = "cliphist-0.7.0-1.7.aarch64.rpm"
RPM_HASH = "238ad589f70bf92e41d84cc11bbc9e737b9e9e7a2215096ba7918a7c3cef93453503c0ceb62ccdacc53da2accd4871b5ca25aa38ee2a273cd435d53933b1a980"

RPROVIDES:${PN} += "cliphist"

RDEPENDS:${PN} += "wl-clipboard \
xdg-utils"

inherit rpm
