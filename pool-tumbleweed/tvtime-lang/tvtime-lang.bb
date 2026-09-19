SUMMARY = "Translations for package tvtime"
DESCRIPTION = "Provides translations for the 'tvtime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-lang-1.0.11-4.6.noarch.rpm"
RPM_HASH = "508fd9cd9e67c46aa6a235ef474c1718ba1d134982e1379201df56cb2ef50d0cdb4fc0f9c43dff61266527b6c110770f99e077a6caa15722a272160cb0d179e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tvtime-ca \
locale-tvtime-cs \
locale-tvtime-de \
locale-tvtime-es \
locale-tvtime-fi \
locale-tvtime-fr \
locale-tvtime-hu \
locale-tvtime-ko \
locale-tvtime-lv \
locale-tvtime-nl \
locale-tvtime-nn \
locale-tvtime-pl \
locale-tvtime-pt \
locale-tvtime-pt-BR \
locale-tvtime-ru \
locale-tvtime-sk \
locale-tvtime-sv \
locale-tvtime-uk \
tvtime-lang \
tvtime-lang-all"

RDEPENDS:${PN} += "tvtime"

inherit rpm
