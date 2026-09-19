SUMMARY = "Client to synchronize media playback on mpv/VLC on multiple computers"
DESCRIPTION = "The client application for Syncplay, allows you to play media in \
synchronization with other users around the world, making movie \
nights even across countries possible."
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "syncplay-client-1.7.6-1.1.noarch.rpm"
RPM_HASH = "c07c1edcaf150913a69ea7affbf534d601c9fc6db1aef17c08e6d63d55783683188b61c1359f4c9c4df621e45bf29e810945d4222eb18df95ebe082da1057b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syncplay-client"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-Twisted \
syncplay-common"

inherit rpm
