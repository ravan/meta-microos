SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.5"

RPM_NAME = "gupnp-av-0.14.5-1.3.aarch64.rpm"
RPM_HASH = "9e43ed0a1236e1f81bf85e8a24a232a7b6031117b2776afda2c3bdd42d5ac1f01e9668dd8ae3c11c920942cc036a0640470423f0dc9d84bfee97f2037965cacc"

RPROVIDES:${PN} += "gupnp-av"

RDEPENDS:${PN} += ""

inherit rpm
