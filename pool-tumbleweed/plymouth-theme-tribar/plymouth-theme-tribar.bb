SUMMARY = "Plymouth 'Tribar' theme"
DESCRIPTION = "This package contains the 'Tribar' boot splash theme for \
Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-tribar-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "5ca9da537661fd0b17ff6e477429a6d705b1a445ace3878f1b9b312d743dd0710262f1b91f9ab1eb0c1fc9cce336eb062c3ac45bef5ba21bedc3ed262f906412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-tribar"

RDEPENDS:${PN} += "plymouth-plugin-tribar \
plymouth-scripts"

inherit rpm
