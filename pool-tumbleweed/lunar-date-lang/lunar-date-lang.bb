SUMMARY = "Translations for package lunar-date"
DESCRIPTION = "Provides translations for the 'lunar-date' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "lunar-date-lang-3.0.1-1.13.noarch.rpm"
RPM_HASH = "b3adc0cbd3bfa0fea7512de01970e4a3db5ac5fa20f927e7d031f4ed940c66dd311e5e6029977fcead426642a3dbd55883135eecabb1e61d332255e9ce239d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lunar-date-zh-CN \
locale-lunar-date-zh-HK \
locale-lunar-date-zh-TW \
lunar-date-lang \
lunar-date-lang-all"

RDEPENDS:${PN} += "lunar-date"

inherit rpm
