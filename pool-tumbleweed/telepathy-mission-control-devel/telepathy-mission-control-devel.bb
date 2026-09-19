SUMMARY = "Telepathy Mission Control instant messaging connection manager"
DESCRIPTION = "Mission Control, or MC, is a Telepathy component providing a way for \
'end-user' applications to abstract some of the details of connection \
managers, to provide a simple way to manipulate a bunch of connection \
managers at once, to remove the need to have in each program the \
account definitions and credentials, to manage channel handling/request \
and to manage presence statuses."
LICENSE = "LGPL-2.1-only"

PV = "5.16.6"

RPM_NAME = "telepathy-mission-control-devel-5.16.6-1.19.aarch64.rpm"
RPM_HASH = "2c6e50dccb2299d0789bd8c4aca26ff848e00ccd0a2fac0fb61b51aaccac7c7c08971072ae1a013975dbde57156297c36773846c02f21fcb27545c4ff34dead0"

RPROVIDES:${PN} += "pkgconfig-mission-control-plugins \
telepathy-mission-control-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmission-control-plugins0 \
pkgconfig-telepathy-glib \
telepathy-mission-control"

inherit rpm
