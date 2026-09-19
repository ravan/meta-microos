SUMMARY = "Languages for package barrel"
DESCRIPTION = "Provides translations to the package barrel"
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "barrel-lang-0.3.2-1.1.noarch.rpm"
RPM_HASH = "702e0bf94d4aa146542f127cb28e64ebb6d08526a6add53f5d70d3189700e13dc684a092a15cb60af459439e427b5b5a51fbe03e4080892769618e9690892b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "barrel-lang \
barrel-lang-all \
locale-barrel-ca \
locale-barrel-cs \
locale-barrel-da \
locale-barrel-de \
locale-barrel-es \
locale-barrel-fr \
locale-barrel-id \
locale-barrel-it \
locale-barrel-ja \
locale-barrel-mk \
locale-barrel-pt-BR \
locale-barrel-sv \
locale-barrel-tr \
locale-barrel-uk \
locale-barrel-zh-CN \
locale-barrel-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
