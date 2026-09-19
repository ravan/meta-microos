SUMMARY = "SIP connection manager for Telepathy - development files"
DESCRIPTION = "IETF SIP connection manager for Telepathy using the SofiaSIP protocol \
stack."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "telepathy-rakia-devel-0.8.0-5.22.aarch64.rpm"
RPM_HASH = "cdc8bb02f07d57c64007015adf95f0d4bc0e31283e7003db927b33740998114cbf7e71bd6daa71cfe5f237c1edc0b7669e24372b9fe6be51a6481a37ae684185"

RPROVIDES:${PN} += "telepathy-rakia-devel"

RDEPENDS:${PN} += "telepathy-rakia"

inherit rpm
