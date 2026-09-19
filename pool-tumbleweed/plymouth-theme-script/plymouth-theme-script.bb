SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "3ddcc94ba50d0b08dcd60b211c16dc959da76682da97e95982e07c6094ea410d1a836176b9d9a44901554cb9b8af81b277f9b86a17dd4d6e615dbac7d0e141b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"

RDEPENDS:${PN} += "plymouth-plugin-script \
plymouth-scripts"

inherit rpm
