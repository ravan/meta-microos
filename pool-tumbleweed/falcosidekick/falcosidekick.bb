SUMMARY = "A simple daemon for connecting Falco to your ecosystem"
DESCRIPTION = "A simple daemon for connecting Falco to your ecosystem. It takes a Falco events \
and forward them to different outputs in a fan-out way. \
 \
It works as a single endpoint for as many Falco instances as you want."
LICENSE = "Apache-2.0"

PV = "2.34.1"

RPM_NAME = "falcosidekick-2.34.1-1.4.aarch64.rpm"
RPM_HASH = "710518850f1fee0283dd9414404084c69ed0a06305aa56cc3e0238c4c309bebf2453136d5f9aac3d5e10952e6f8a31f98f6d8738ed60b2ba41c7e1c101312603"

RPROVIDES:${PN} += "falcosidekick"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
