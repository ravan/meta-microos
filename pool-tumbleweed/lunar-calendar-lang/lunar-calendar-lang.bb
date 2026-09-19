SUMMARY = "Translations for package lunar-calendar"
DESCRIPTION = "Provides translations for the 'lunar-calendar' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-calendar-lang-3.0.1-1.13.noarch.rpm"
RPM_HASH = "18323c7b6d8ca3522fde9608dc910b9b037063154d7dd82468ec908e8f695b761a20937c7fc81b1e6ca95abf021c5c89584c5a1d3a31e06dc8698a6467a651e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lunar-calendar-zh-CN \
locale-lunar-calendar-zh-HK \
locale-lunar-calendar-zh-TW \
lunar-calendar-lang \
lunar-calendar-lang-all"

RDEPENDS:${PN} += "lunar-calendar"

inherit rpm
