SUMMARY = "Ubuntu Mono Icon theme"
DESCRIPTION = "Dark and Light panel icons to make desktop beautiful."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "ubuntu-mono-icon-theme-20.10-2.10.noarch.rpm"
RPM_HASH = "924e0b175739b83a7c80cb36ccc4412428df0f54a28f0c1223163089913458954b3659e238184355e7d07fb81ee23a20f31bd0050045c0f7152aa02ea9307fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mono \
ubuntu-mono-icon-theme"

RDEPENDS:${PN} += "adwaita-icon-theme \
hicolor-icon-theme \
humanity-icon-theme"

inherit rpm
