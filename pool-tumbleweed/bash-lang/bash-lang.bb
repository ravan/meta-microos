SUMMARY = "Translations for package bash"
DESCRIPTION = "Provides translations for the 'bash' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.15"

RPM_NAME = "bash-lang-5.3.15-8.2.noarch.rpm"
RPM_HASH = "1aaa977bd1d18aecdf751937e2cb9f98691d90bb9bd982d15c4b129b6a7e377bad318d236e4a1d95ff9453c76a6340ff2b13284854a927d2c83e2cc5a4c9d8bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-lang \
bash-lang-all \
locale-bash-af \
locale-bash-bg \
locale-bash-ca \
locale-bash-cs \
locale-bash-da \
locale-bash-de \
locale-bash-el \
locale-bash-en@boldquot \
locale-bash-en@quot \
locale-bash-eo \
locale-bash-es \
locale-bash-et \
locale-bash-fi \
locale-bash-fr \
locale-bash-ga \
locale-bash-gl \
locale-bash-hr \
locale-bash-hu \
locale-bash-id \
locale-bash-it \
locale-bash-ja \
locale-bash-ka \
locale-bash-ko \
locale-bash-lt \
locale-bash-nb \
locale-bash-nl \
locale-bash-pl \
locale-bash-pt \
locale-bash-pt-BR \
locale-bash-ro \
locale-bash-ru \
locale-bash-sk \
locale-bash-sl \
locale-bash-sq \
locale-bash-sr \
locale-bash-sv \
locale-bash-tr \
locale-bash-uk \
locale-bash-vi \
locale-bash-zh-CN \
locale-bash-zh-TW"

RDEPENDS:${PN} += "bash"

inherit rpm
