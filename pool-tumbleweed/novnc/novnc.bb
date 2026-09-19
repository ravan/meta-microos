SUMMARY = "VNC client using HTML5 (Web Sockets, Canvas) with encryption support"
DESCRIPTION = "This package provides a Websocket implementation of the VNC client. \
It is used by OpenStack Horizon to provide a console view of running \
instances."
LICENSE = "LGPL-3.0-only & MPL-2.0"

PV = "1.7.0"

RPM_NAME = "novnc-1.7.0-1.2.noarch.rpm"
RPM_HASH = "6003c699fb1a386ac9fe577c2580b4ac110f2149b35b670dc325d74fbabaf5e73b5ca4efea60f595c6ecb714868d116b0b0bcdac25b000d61607ac886cc29d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "novnc"

RDEPENDS:${PN} += "/usr/bin/bash \
python3-websockify \
which"

inherit rpm
