SUMMARY = "Translations for package filelight"
DESCRIPTION = "Provides translations for the 'filelight' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "filelight-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a4324197b6a2464dccc5f6597c61e9f671b960105de8d4a55989bcbf08346507833a560d6ca61acac8a8d23b643bc6fb2336be84540e90e19b10bcb971a944cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filelight-lang \
filelight-lang-all \
locale-filelight-ar \
locale-filelight-ast \
locale-filelight-az \
locale-filelight-bg \
locale-filelight-bs \
locale-filelight-ca \
locale-filelight-ca@valencia \
locale-filelight-cs \
locale-filelight-da \
locale-filelight-de \
locale-filelight-el \
locale-filelight-en-GB \
locale-filelight-eo \
locale-filelight-es \
locale-filelight-et \
locale-filelight-eu \
locale-filelight-fi \
locale-filelight-fr \
locale-filelight-ga \
locale-filelight-gl \
locale-filelight-he \
locale-filelight-hi \
locale-filelight-hu \
locale-filelight-ia \
locale-filelight-id \
locale-filelight-is \
locale-filelight-it \
locale-filelight-ja \
locale-filelight-ka \
locale-filelight-kk \
locale-filelight-ko \
locale-filelight-lt \
locale-filelight-lv \
locale-filelight-mr \
locale-filelight-nb \
locale-filelight-nds \
locale-filelight-nl \
locale-filelight-nn \
locale-filelight-pa \
locale-filelight-pl \
locale-filelight-pt \
locale-filelight-pt-BR \
locale-filelight-ro \
locale-filelight-ru \
locale-filelight-sk \
locale-filelight-sl \
locale-filelight-sr \
locale-filelight-sr@ijekavian \
locale-filelight-sr@ijekavianlatin \
locale-filelight-sr@latin \
locale-filelight-sv \
locale-filelight-ta \
locale-filelight-tr \
locale-filelight-ug \
locale-filelight-uk \
locale-filelight-zh-CN \
locale-filelight-zh-TW"

RDEPENDS:${PN} += "filelight"

inherit rpm
