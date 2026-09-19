SUMMARY = "Translations for package gcr"
DESCRIPTION = "Provides translations for the 'gcr' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "gcr-lang-4.4.0.1-3.3.noarch.rpm"
RPM_HASH = "10a211231b13c4f23e07e541633febbe3299fb8777cafccdb3cabe2b343c1c4a6133088071ebdfa7b7c98ec5734fef6de6463a66c42d4841b5cf3ec3f01b116b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcr-lang \
gcr-lang-all \
locale-gcr-af \
locale-gcr-ar \
locale-gcr-as \
locale-gcr-ast \
locale-gcr-az \
locale-gcr-be \
locale-gcr-be@latin \
locale-gcr-bg \
locale-gcr-bn \
locale-gcr-bn-IN \
locale-gcr-bs \
locale-gcr-ca \
locale-gcr-ca@valencia \
locale-gcr-cs \
locale-gcr-cy \
locale-gcr-da \
locale-gcr-de \
locale-gcr-dz \
locale-gcr-el \
locale-gcr-en-CA \
locale-gcr-en-GB \
locale-gcr-en@shaw \
locale-gcr-eo \
locale-gcr-es \
locale-gcr-et \
locale-gcr-eu \
locale-gcr-fa \
locale-gcr-fi \
locale-gcr-fr \
locale-gcr-fur \
locale-gcr-ga \
locale-gcr-gl \
locale-gcr-gu \
locale-gcr-he \
locale-gcr-hi \
locale-gcr-hr \
locale-gcr-hu \
locale-gcr-id \
locale-gcr-is \
locale-gcr-it \
locale-gcr-ja \
locale-gcr-ka \
locale-gcr-kk \
locale-gcr-kn \
locale-gcr-ko \
locale-gcr-lt \
locale-gcr-lv \
locale-gcr-mai \
locale-gcr-mk \
locale-gcr-ml \
locale-gcr-mr \
locale-gcr-ms \
locale-gcr-nb \
locale-gcr-ne \
locale-gcr-nl \
locale-gcr-nn \
locale-gcr-oc \
locale-gcr-or \
locale-gcr-pa \
locale-gcr-pl \
locale-gcr-pt \
locale-gcr-pt-BR \
locale-gcr-ro \
locale-gcr-ru \
locale-gcr-si \
locale-gcr-sk \
locale-gcr-sl \
locale-gcr-sq \
locale-gcr-sr \
locale-gcr-sr@latin \
locale-gcr-sv \
locale-gcr-ta \
locale-gcr-te \
locale-gcr-th \
locale-gcr-tr \
locale-gcr-ug \
locale-gcr-uk \
locale-gcr-vi \
locale-gcr-zh-CN \
locale-gcr-zh-HK \
locale-gcr-zh-TW"

RDEPENDS:${PN} += "gcr"

inherit rpm
