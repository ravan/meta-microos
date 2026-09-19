SUMMARY = "Server for the Syncplay media synchronizing application"
DESCRIPTION = "The server applciation for Syncplay, acts as a hub for other users \
to connect to and watch videos together in synchronization."
LICENSE = "Apache-2.0"

PV = "1.7.6"

RPM_NAME = "syncplay-server-1.7.6-1.1.noarch.rpm"
RPM_HASH = "7ac47030e5700e5aa8b60ca72c188d69e4029e24f06c3251990bfce06c4a6aa15f7fbed7a048aa9e364ed82bc69eac59740a7bf235efdaea97d989c65277d1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syncplay-server"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-Twisted \
syncplay-common"

inherit rpm
