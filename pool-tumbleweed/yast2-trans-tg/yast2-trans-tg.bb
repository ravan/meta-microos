SUMMARY = "YaST2 - Tajik Translations"
DESCRIPTION = "YaST2 - Tajik translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-tg-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "0ebc02ba98e0726e9eb6cd0c1d31238c7f3023147b15868eb2a3dab7e65d75013cd8870d0721b08efd3c1a6ee74f75913f3bb4795a843308d73e6ff81197722a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tg \
yast2-trans-tg"

RDEPENDS:${PN} += ""

inherit rpm
