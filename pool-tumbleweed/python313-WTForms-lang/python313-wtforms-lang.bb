SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python313-WTForms-lang-3.2.1-1.5.noarch.rpm"
RPM_HASH = "94e1361986491e9077421e7f6c18e69f3ba4ce22b8769afef06f7672c69719095ede02955bc736cab2f5419fed256a960c029559e5f9eba7f1c85253b5737cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python313-WTForms-ar \
locale-python313-WTForms-bg \
locale-python313-WTForms-ca \
locale-python313-WTForms-cs-CZ \
locale-python313-WTForms-cy \
locale-python313-WTForms-de \
locale-python313-WTForms-de-CH \
locale-python313-WTForms-el \
locale-python313-WTForms-en \
locale-python313-WTForms-es \
locale-python313-WTForms-et \
locale-python313-WTForms-fa \
locale-python313-WTForms-fi \
locale-python313-WTForms-fr \
locale-python313-WTForms-he \
locale-python313-WTForms-hu \
locale-python313-WTForms-it \
locale-python313-WTForms-ja \
locale-python313-WTForms-kk \
locale-python313-WTForms-ko \
locale-python313-WTForms-nb \
locale-python313-WTForms-nl \
locale-python313-WTForms-pl \
locale-python313-WTForms-pt \
locale-python313-WTForms-ro \
locale-python313-WTForms-ru \
locale-python313-WTForms-sk \
locale-python313-WTForms-sv \
locale-python313-WTForms-tr \
locale-python313-WTForms-uk \
locale-python313-WTForms-zh \
locale-python313-WTForms-zh-TW \
python3-WTForms-lang \
python313-WTForms-lang"

RDEPENDS:${PN} += "python313-WTForms"

inherit rpm
