SUMMARY = "Translations for package gearlever"
DESCRIPTION = "Provides translations for the 'gearlever' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.6.2"

RPM_NAME = "gearlever-lang-4.6.2-1.1.noarch.rpm"
RPM_HASH = "d116b977db4ce67dca7329f1202c7a40ba22ec8bb50febb5ca892f5461188f4fbbf1dbce471fb80d490ef976e741d8648f6b7f5294933476d1174330979116c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gearlever-lang \
gearlever-lang-all \
locale-gearlever-ar \
locale-gearlever-cs \
locale-gearlever-de \
locale-gearlever-es \
locale-gearlever-fi-FI \
locale-gearlever-fr \
locale-gearlever-he \
locale-gearlever-hi \
locale-gearlever-it \
locale-gearlever-ka \
locale-gearlever-nl \
locale-gearlever-oc \
locale-gearlever-pl-PL \
locale-gearlever-pt-BR \
locale-gearlever-pt-PT \
locale-gearlever-ru \
locale-gearlever-sk \
locale-gearlever-tr \
locale-gearlever-uk \
locale-gearlever-vi \
locale-gearlever-zh-CN \
locale-gearlever-zh-TW"

RDEPENDS:${PN} += "gearlever"

inherit rpm
