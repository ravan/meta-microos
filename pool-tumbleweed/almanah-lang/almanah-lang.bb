SUMMARY = "Translations for package almanah"
DESCRIPTION = "Provides translations for the 'almanah' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.4"

RPM_NAME = "almanah-lang-0.12.4-2.5.noarch.rpm"
RPM_HASH = "ceb4bd724a19981b88809545a647b231d795543448e3a6bce3f4bd10404a72f93a6add237bed3da368b86ee910d8b0084209898237a783cf63400be10428ce90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "almanah-lang \
almanah-lang-all \
locale-almanah-ar \
locale-almanah-bs \
locale-almanah-ca \
locale-almanah-cs \
locale-almanah-da \
locale-almanah-de \
locale-almanah-el \
locale-almanah-en-GB \
locale-almanah-eo \
locale-almanah-es \
locale-almanah-eu \
locale-almanah-fi \
locale-almanah-fr \
locale-almanah-fur \
locale-almanah-gl \
locale-almanah-hi \
locale-almanah-hu \
locale-almanah-id \
locale-almanah-is \
locale-almanah-it \
locale-almanah-ka \
locale-almanah-lv \
locale-almanah-ms \
locale-almanah-nb \
locale-almanah-nl \
locale-almanah-oc \
locale-almanah-pl \
locale-almanah-pt \
locale-almanah-pt-BR \
locale-almanah-ro \
locale-almanah-ru \
locale-almanah-sl \
locale-almanah-sr \
locale-almanah-sr@latin \
locale-almanah-sv \
locale-almanah-th \
locale-almanah-tr \
locale-almanah-uk \
locale-almanah-zh-CN"

RDEPENDS:${PN} += "almanah"

inherit rpm
