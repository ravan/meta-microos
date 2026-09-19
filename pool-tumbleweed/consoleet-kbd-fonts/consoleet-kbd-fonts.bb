SUMMARY = "Vector/OTF versions of some classic kbd fonts"
DESCRIPTION = "These are OpenType remakes of (some of) the VGA bitmap fonts otherwise \
found in the 'kbd' package and in /usr/share/kbd/consolefonts/."
LICENSE = "CC-BY-SA-4.0"

PV = "1.3"

RPM_NAME = "consoleet-kbd-fonts-1.3-1.9.noarch.rpm"
RPM_HASH = "688149eee6d81f28f96dcf80f442700a6a3b5e798abced51e6320f64c158c8e801b335ae6acce28ff5d08a5f6c47899299336ec205b630028210fc9a2b2169e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-kbd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
