SUMMARY = "Translations for package waylyrics"
DESCRIPTION = "Provides translations for the 'waylyrics' package."
LICENSE = "GPL-3.0-or-later & MIT & MPL-2.0"

PV = "0.4.0"

RPM_NAME = "waylyrics-lang-0.4.0-2.1.noarch.rpm"
RPM_HASH = "e1fde19b8f46dc62608a670af364332efee8e12dfcac4404feb62fbdb9e79b782a8d678cf3e72224dbbe852d9494710f74302655c296db4d81b18a302dd3ec39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-waylyrics-en-US \
locale-waylyrics-it-IT \
locale-waylyrics-zh-CN \
waylyrics-lang \
waylyrics-lang-all"

RDEPENDS:${PN} += "waylyrics"

inherit rpm
