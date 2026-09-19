SUMMARY = "The desktop backgrounds for the Pantheon DE"
DESCRIPTION = "This package contains quality desktop backgrounds"
LICENSE = "CC-BY-NC-SA-4.0 & CC0-1.0"

PV = "8.0.0"

RPM_NAME = "pantheon-wallpapers-8.0.0-1.6.noarch.rpm"
RPM_HASH = "76a591ef02e7a3fc67cf550c6174028b8a89264196aa60dbf636dd5c76216b17adec451d6bbfc48c6b1b1f0fe4f16ef19905160393e9e89826f159dc9985faec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-wallpapers \
pantheon-wallpapers"

RDEPENDS:${PN} += ""

inherit rpm
