SUMMARY = "Amiri Naksh Typeface"
DESCRIPTION = "Amiri family is high quality Arabic Naskh typeface."
LICENSE = "OFL-1.1"

PV = "0.109"

RPM_NAME = "arabic-amiri-fonts-0.109-18.23.noarch.rpm"
RPM_HASH = "cbb97feeb1a289de5d5470f4f804c537eddefe9259428e15ec74ea6dcc2a5172ba2227cdbd89ea2b033c91d2f0bae3469bb74c35816eec7eff01105826a0e0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-amiri-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
