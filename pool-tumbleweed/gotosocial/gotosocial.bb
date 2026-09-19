SUMMARY = "An ActivityPub social network server, written in Golang"
DESCRIPTION = "With GoToSocial, you can keep in touch with your friends, post, read, and share \
images and articles. All without being tracked or advertised to!"
LICENSE = "AGPL-3.0-only"

PV = "0.22.1"

RPM_NAME = "gotosocial-0.22.1-2.1.aarch64.rpm"
RPM_HASH = "385419d9dbf97451ce96c329f198f6a86677ddaa7c0ae78fc8f36ed76117fb6f5a452b7d0954673065f003ca385788dd730d0988b1dcf0fddbdff1d8b48df963"

RPROVIDES:${PN} += "config-gotosocial \
gotosocial \
group-gotosocial \
user-gotosocial"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
