SUMMARY = "Library to access Blu-Ray disk - BD-J support"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libbluray-bdj-1.4.1-1.3.noarch.rpm"
RPM_HASH = "14a3f99ab8440e1eda5d415ea80072ca8caf2ea7f9dfa8d2b53570db832990dcea81f42838994b2d09202aed84c7150550dcb47af86d55bc294769a71630a550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbluray-bdj"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
