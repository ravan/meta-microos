SUMMARY = "The Red Eclipse server binary"
DESCRIPTION = "This package contains the server binary for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-server-2.0.0-5.1.aarch64.rpm"
RPM_HASH = "8d9a9a1d0321369a5cacfae1c67cf9f3686b3722491bced2535a615cdb0982351c209b5b6ac51f45fe23c269102e29c9571cd2ef5f768aec8725fc4048a61090"

RPROVIDES:${PN} += "redeclipse-server"

RDEPENDS:${PN} += "/usr/bin/sh \
redeclipse-data"

inherit rpm
