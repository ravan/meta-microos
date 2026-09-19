SUMMARY = "Yuyo Gtk Theme -- Common Files"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "metatheme-yuyo-common-0.3-1.24.noarch.rpm"
RPM_HASH = "e1d7f39f07f5696fdc5723dd8ca4655d2a75e6690c3c8b31122d36c75da84fce3be15e8def2ce030f900648ed5f444d63083b7aa42209f9e9a520f8d3acb0af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yuyo-common"

RDEPENDS:${PN} += ""

inherit rpm
