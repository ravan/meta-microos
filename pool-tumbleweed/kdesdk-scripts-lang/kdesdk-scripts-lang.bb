SUMMARY = "Translations for package kdesdk-scripts"
DESCRIPTION = "Provides translations for the 'kdesdk-scripts' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kdesdk-scripts-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5aacaca64a314b1e3aae74562c6416276fa90d40152bb67b8f341ea42c98f164f59a94027075c45fe6bb48e587593ea9a5ce252cc0b0f410450685eda951ef44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-scripts-lang \
kdesdk-scripts-lang-all"

RDEPENDS:${PN} += "kdesdk-scripts"

inherit rpm
