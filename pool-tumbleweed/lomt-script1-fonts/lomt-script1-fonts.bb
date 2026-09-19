SUMMARY = "League Of Movable Type's 'League Script Number One' font"
DESCRIPTION = "Script #1 is a modern, coquettish script font that intends to look \
like handwritten letters from the 1920s. It includes ligatures \
included."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-script1-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "e4af74156e85cb0b85a6c7db257c79fb0816937f8b5309c7330bef2d6fdedc4580724a311c31d493b774720a431056f54f8b22a2ba6edf5ac4192955a6290696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-script1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
