SUMMARY = "Translations for package smb4k"
DESCRIPTION = "Provides translations for the 'smb4k' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.6"

RPM_NAME = "smb4k-lang-4.0.6-1.1.noarch.rpm"
RPM_HASH = "96c31d591772072fce7b02f925d5ad7e278a4438fd5a00345234b72856ce31b244ce3efaa3702b84729588a1c5faf8df3e33996a019313b0fd2e1f5e1fe9ae53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-smb4k-ar \
locale-smb4k-bg \
locale-smb4k-bs \
locale-smb4k-ca \
locale-smb4k-ca@valencia \
locale-smb4k-cs \
locale-smb4k-da \
locale-smb4k-de \
locale-smb4k-el \
locale-smb4k-en-GB \
locale-smb4k-eo \
locale-smb4k-es \
locale-smb4k-et \
locale-smb4k-eu \
locale-smb4k-fi \
locale-smb4k-fr \
locale-smb4k-ga \
locale-smb4k-gl \
locale-smb4k-he \
locale-smb4k-hu \
locale-smb4k-ia \
locale-smb4k-is \
locale-smb4k-it \
locale-smb4k-ja \
locale-smb4k-ka \
locale-smb4k-ko \
locale-smb4k-lt \
locale-smb4k-mai \
locale-smb4k-mr \
locale-smb4k-nb \
locale-smb4k-nds \
locale-smb4k-nl \
locale-smb4k-nn \
locale-smb4k-pl \
locale-smb4k-pt \
locale-smb4k-pt-BR \
locale-smb4k-ro \
locale-smb4k-ru \
locale-smb4k-sk \
locale-smb4k-sl \
locale-smb4k-sv \
locale-smb4k-tr \
locale-smb4k-ug \
locale-smb4k-uk \
locale-smb4k-zh-CN \
locale-smb4k-zh-TW \
smb4k-lang \
smb4k-lang-all"

RDEPENDS:${PN} += "smb4k"

inherit rpm
