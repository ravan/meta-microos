SUMMARY = "Translations for package lshw"
DESCRIPTION = "Provides translations for the 'lshw' package."
LICENSE = "GPL-2.0-only"

PV = "B.02.20"

RPM_NAME = "lshw-lang-B.02.20-3.3.noarch.rpm"
RPM_HASH = "2cb96ed647b9140ac13b0af340a8243b5d760e2d2704c92de1464d56f57cda14ca16e783357197d86dc84433af3268a9bd53b3c9b3db07cf1ccc1c369dd6251b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lshw-ca \
locale-lshw-es \
locale-lshw-fr \
lshw-lang \
lshw-lang-all"

RDEPENDS:${PN} += "lshw"

inherit rpm
