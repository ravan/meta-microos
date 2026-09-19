SUMMARY = "Firefox Extension for Belgium eID Middleware"
DESCRIPTION = "Mozilla Firefox extension for using the Belgian eID (electronic identity card)."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.29"

RPM_NAME = "eid-mw-firefox-5.1.29-1.2.aarch64.rpm"
RPM_HASH = "752986c53d3fc6969893b2977467949741c5783d1b1b13aad59faaa7b5b3c4ea704d8ab59b7a6a1faa0856758e84b3922739f467a6897ba8b14f920bba8443b5"

RPROVIDES:${PN} += "eid-mw-firefox"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
