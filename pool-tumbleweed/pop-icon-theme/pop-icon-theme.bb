SUMMARY = "System76 Pop icon theme for Linux"
DESCRIPTION = "Pop_Icons use a semi-flat design with raised 3D motifs to help give depth to \
icons. Included in the theme are flat symbolic (single-color) icons as well as \
full-color stylized icons."
LICENSE = "CC-BY-SA-4.0"

PV = "3.5.1"

RPM_NAME = "pop-icon-theme-3.5.1-1.2.noarch.rpm"
RPM_HASH = "6c1e5b9c109a0a8c5ff2af227c4b8e8830bc216567c0b6455b63785341404cb6562b631a262488fb7b5fa464fae960c9a015ed46e757f22fd35b806c81cb6749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pop-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
hicolor-icon-theme"

inherit rpm
