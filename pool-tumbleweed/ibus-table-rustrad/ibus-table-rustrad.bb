SUMMARY = "Rustrad input method for IBus framework"
DESCRIPTION = "ibus-table-rustrad provides Rustrad input method on IBus Table under IBus \
framework."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.21"

RPM_NAME = "ibus-table-rustrad-1.3.21-1.5.noarch.rpm"
RPM_HASH = "5855ca169f8a41bf41363f30a71868bb7eb5cc7925122f492853bac25a815b0f255c83b30059dc6da573ed04b45de76a3d7884bd87102042c3a9450a32a1ddc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-rustrad \
locale-ibus-ru"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
