SUMMARY = "Media Player Information"
DESCRIPTION = "This package contains a repository of data files describing media player \
(mostly USB Mass Storage ones) capabilities. These files contain information \
about the directory layout to use to add music to these devices, about the \
supported file formats, ... These capabilities used to be provided by HAL \
in the 10-usb-music-players.fdi file but had to be moved elsewhere as part \
of the big HALectomy."
LICENSE = "BSD-3-Clause"

PV = "26"

RPM_NAME = "media-player-info-26-1.6.noarch.rpm"
RPM_HASH = "bb1179a1707e4f61114735b99233cfc3b14fbe24b8854fc072f20b7a6d49accd66d7497c9993cc11e1a6f97d7b8dd62644d91009453e3c0b7258c1e599128475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "media-player-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
