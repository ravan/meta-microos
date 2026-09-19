SUMMARY = "Translations for package libKF6SyntaxHighlighting6"
DESCRIPTION = "Provides translations for the 'libKF6SyntaxHighlighting6' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "6.30.0"

RPM_NAME = "libKF6SyntaxHighlighting6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "644c7f35d88cbd4a72205460db30078c355b1e50cd15a36f8de34ed805687ce5c67ef08a064d3da8538313c43d32a79df345172a3980fec89a62484c9f04a320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6SyntaxHighlighting6-lang \
libKF6SyntaxHighlighting6-lang-all \
locale-libKF6SyntaxHighlighting6-af \
locale-libKF6SyntaxHighlighting6-ar \
locale-libKF6SyntaxHighlighting6-ast \
locale-libKF6SyntaxHighlighting6-az \
locale-libKF6SyntaxHighlighting6-be \
locale-libKF6SyntaxHighlighting6-bg \
locale-libKF6SyntaxHighlighting6-bn \
locale-libKF6SyntaxHighlighting6-br \
locale-libKF6SyntaxHighlighting6-bs \
locale-libKF6SyntaxHighlighting6-ca \
locale-libKF6SyntaxHighlighting6-ca@valencia \
locale-libKF6SyntaxHighlighting6-cs \
locale-libKF6SyntaxHighlighting6-cy \
locale-libKF6SyntaxHighlighting6-da \
locale-libKF6SyntaxHighlighting6-de \
locale-libKF6SyntaxHighlighting6-el \
locale-libKF6SyntaxHighlighting6-en-GB \
locale-libKF6SyntaxHighlighting6-eo \
locale-libKF6SyntaxHighlighting6-es \
locale-libKF6SyntaxHighlighting6-et \
locale-libKF6SyntaxHighlighting6-eu \
locale-libKF6SyntaxHighlighting6-fa \
locale-libKF6SyntaxHighlighting6-fi \
locale-libKF6SyntaxHighlighting6-fr \
locale-libKF6SyntaxHighlighting6-ga \
locale-libKF6SyntaxHighlighting6-gl \
locale-libKF6SyntaxHighlighting6-gu \
locale-libKF6SyntaxHighlighting6-he \
locale-libKF6SyntaxHighlighting6-hi \
locale-libKF6SyntaxHighlighting6-hr \
locale-libKF6SyntaxHighlighting6-hu \
locale-libKF6SyntaxHighlighting6-ia \
locale-libKF6SyntaxHighlighting6-id \
locale-libKF6SyntaxHighlighting6-is \
locale-libKF6SyntaxHighlighting6-it \
locale-libKF6SyntaxHighlighting6-ja \
locale-libKF6SyntaxHighlighting6-ka \
locale-libKF6SyntaxHighlighting6-kk \
locale-libKF6SyntaxHighlighting6-km \
locale-libKF6SyntaxHighlighting6-ko \
locale-libKF6SyntaxHighlighting6-lt \
locale-libKF6SyntaxHighlighting6-lv \
locale-libKF6SyntaxHighlighting6-mai \
locale-libKF6SyntaxHighlighting6-mk \
locale-libKF6SyntaxHighlighting6-ml \
locale-libKF6SyntaxHighlighting6-mr \
locale-libKF6SyntaxHighlighting6-ms \
locale-libKF6SyntaxHighlighting6-nb \
locale-libKF6SyntaxHighlighting6-nds \
locale-libKF6SyntaxHighlighting6-ne \
locale-libKF6SyntaxHighlighting6-nl \
locale-libKF6SyntaxHighlighting6-nn \
locale-libKF6SyntaxHighlighting6-oc \
locale-libKF6SyntaxHighlighting6-pa \
locale-libKF6SyntaxHighlighting6-pl \
locale-libKF6SyntaxHighlighting6-pt \
locale-libKF6SyntaxHighlighting6-pt-BR \
locale-libKF6SyntaxHighlighting6-ro \
locale-libKF6SyntaxHighlighting6-ru \
locale-libKF6SyntaxHighlighting6-si \
locale-libKF6SyntaxHighlighting6-sk \
locale-libKF6SyntaxHighlighting6-sl \
locale-libKF6SyntaxHighlighting6-sq \
locale-libKF6SyntaxHighlighting6-sr \
locale-libKF6SyntaxHighlighting6-sr@ijekavian \
locale-libKF6SyntaxHighlighting6-sr@ijekavianlatin \
locale-libKF6SyntaxHighlighting6-sr@latin \
locale-libKF6SyntaxHighlighting6-sv \
locale-libKF6SyntaxHighlighting6-ta \
locale-libKF6SyntaxHighlighting6-th \
locale-libKF6SyntaxHighlighting6-tr \
locale-libKF6SyntaxHighlighting6-ug \
locale-libKF6SyntaxHighlighting6-uk \
locale-libKF6SyntaxHighlighting6-vi \
locale-libKF6SyntaxHighlighting6-wa \
locale-libKF6SyntaxHighlighting6-zh-CN \
locale-libKF6SyntaxHighlighting6-zh-TW"

RDEPENDS:${PN} += "libKF6SyntaxHighlighting6"

inherit rpm
