SUMMARY = "Server component for osc collab"
DESCRIPTION = "The server part of osc-plugin-collab, handles package reservations \
and tracks in a database the various versions in devel projects, Factory \
and upstream."
LICENSE = "BSD-3-Clause"

PV = "0.104+30"

RPM_NAME = "osc-collab-server-0.104+30-1.9.noarch.rpm"
RPM_HASH = "715dd1bd7a76072f7bd97256ad9ed55f23cb36c717541e4c64ab237b11e028214d54e0efebc7fc357ff46deb03bf70de48c910b631bf3269b7597f8f1487cd34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-osc-collab-server \
osc-collab-server"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
osc \
python3 \
python3-feedparser \
python3-rpm \
python3-sgmllib3k \
python3-xml \
user-osc-collab \
withlock"

inherit rpm
