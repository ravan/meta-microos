SUMMARY = "Source Han Sans variation for Japanese"
DESCRIPTION = "Source Han Sans is a pan-CJK typeface in OpenType/CFF and CID forms."
LICENSE = "OFL-1.1"

PV = "2.005"

RPM_NAME = "adobe-sourcehansans-jp-fonts-2.005-1.3.noarch.rpm"
RPM_HASH = "f66531ebc30900ebef6b8eb57935bc31444a43e771e54fc803632337a7d34eb36ae08dca7a7424c39e9c821d1565d696ec7881bb663a870cd94ab471ae80df39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehansans-jp-fonts \
locale-jp \
scalable-font-jp"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
