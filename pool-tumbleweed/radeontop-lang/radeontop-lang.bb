SUMMARY = "Translations for package radeontop"
DESCRIPTION = "Provides translations for the 'radeontop' package."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-lang-1.4-2.3.noarch.rpm"
RPM_HASH = "6789501af2bdef8e42e457364b4bc9b62e5acd8b5f52077b927a95407b9377eb493bd85346de0aa6b4bf57b718211e12692289a87f369756f84c4b09168fccd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-radeontop-cs \
locale-radeontop-de \
locale-radeontop-el \
locale-radeontop-es \
locale-radeontop-fi \
locale-radeontop-fr \
locale-radeontop-ru \
locale-radeontop-sl \
locale-radeontop-tr \
locale-radeontop-zh-CN \
radeontop-lang \
radeontop-lang-all"

RDEPENDS:${PN} += "radeontop"

inherit rpm
