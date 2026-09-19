SUMMARY = "SUSE PolicyKit default permissions"
DESCRIPTION = "Predefined polkit profiles for different usage scenarios like desktop and \
server. These profiles define the kind of authentication required for various \
polkit actions used across applications."
LICENSE = "GPL-2.0-or-later"

PV = "1550+20260825.76d85e6"

RPM_NAME = "polkit-default-privs-1550+20260825.76d85e6-1.1.noarch.rpm"
RPM_HASH = "dd3290a2c1a30c1fa0f69680630b0c0a4f3077a23ae27ab9822fa813eeac9855cd6f2d57b49d4645dd9735db5078857c9554149778098719f48f3e5e33f78eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "polkit-default-privs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
polkit"

inherit rpm
