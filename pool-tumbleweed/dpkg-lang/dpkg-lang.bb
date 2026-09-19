SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.22.22"

RPM_NAME = "dpkg-lang-1.22.22-1.4.noarch.rpm"
RPM_HASH = "67f908560e1384ed7b6878e138ce73422553ad7d70f18d43925c827d9857f99403f28ce61ef04f21106ad751dab5864630107266fbe8306074d049df6527088b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpkg-lang \
dpkg-lang-all \
locale-dpkg-ast \
locale-dpkg-bs \
locale-dpkg-ca \
locale-dpkg-cs \
locale-dpkg-da \
locale-dpkg-de \
locale-dpkg-dz \
locale-dpkg-el \
locale-dpkg-eo \
locale-dpkg-es \
locale-dpkg-et \
locale-dpkg-eu \
locale-dpkg-fr \
locale-dpkg-gl \
locale-dpkg-hu \
locale-dpkg-id \
locale-dpkg-it \
locale-dpkg-ja \
locale-dpkg-km \
locale-dpkg-ko \
locale-dpkg-lt \
locale-dpkg-mr \
locale-dpkg-nb \
locale-dpkg-ne \
locale-dpkg-nl \
locale-dpkg-nn \
locale-dpkg-oc \
locale-dpkg-pa \
locale-dpkg-pl \
locale-dpkg-pt \
locale-dpkg-pt-BR \
locale-dpkg-ro \
locale-dpkg-ru \
locale-dpkg-sk \
locale-dpkg-sv \
locale-dpkg-th \
locale-dpkg-tr \
locale-dpkg-vi \
locale-dpkg-zh-CN \
locale-dpkg-zh-TW"

RDEPENDS:${PN} += "dpkg"

inherit rpm
