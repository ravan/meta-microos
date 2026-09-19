SUMMARY = "YaST2 - Development Tools"
DESCRIPTION = "Scripts and templates for developing YaST2 modules and components."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.4"

RPM_NAME = "yast2-devtools-5.0.4-1.1.noarch.rpm"
RPM_HASH = "0665a9c25832287573d4d653955a62001c8695f19cd092ca9f13c4735374ec6f3760b08df479da927fc3837ed232a4689e2279485aa75e3a944f6696ec7260a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-devtools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
which \
yast2-buildtools"

inherit rpm
