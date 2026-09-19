SUMMARY = "Translations for package mednafen"
DESCRIPTION = "Provides translations for the 'mednafen' package."
LICENSE = "GPL-2.0-only"

PV = "1.32.1"

RPM_NAME = "mednafen-lang-1.32.1-1.12.noarch.rpm"
RPM_HASH = "572807a9f5630fe5c7bf16c21637438131c8f4d4b6ff27c1d319303cbcb154ce1bec8ceb53ac004799d5b5f5df0d16af0f22a3856c90358f06bed7f162e83d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mednafen-de \
locale-mednafen-es \
locale-mednafen-ru \
mednafen-lang \
mednafen-lang-all"

RDEPENDS:${PN} += "mednafen"

inherit rpm
