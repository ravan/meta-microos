SUMMARY = "Translations for package wget"
DESCRIPTION = "Provides translations for the 'wget' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.25.0"

RPM_NAME = "wget-lang-1.25.0-7.1.noarch.rpm"
RPM_HASH = "f4e1179d4699914652fbf9030912dec147b733357ec2b33b1bee99dd298c9d669acdc44103ee814d136c6436b653729028c195f341127367568a0a71bf710bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wget-af \
locale-wget-be \
locale-wget-bg \
locale-wget-ca \
locale-wget-cs \
locale-wget-da \
locale-wget-de \
locale-wget-el \
locale-wget-en-GB \
locale-wget-eo \
locale-wget-es \
locale-wget-et \
locale-wget-eu \
locale-wget-fi \
locale-wget-fr \
locale-wget-ga \
locale-wget-gl \
locale-wget-he \
locale-wget-hr \
locale-wget-hu \
locale-wget-id \
locale-wget-it \
locale-wget-ja \
locale-wget-ka \
locale-wget-ko \
locale-wget-lt \
locale-wget-ms \
locale-wget-nb \
locale-wget-nl \
locale-wget-pl \
locale-wget-pt \
locale-wget-pt-BR \
locale-wget-ro \
locale-wget-ru \
locale-wget-sk \
locale-wget-sl \
locale-wget-sr \
locale-wget-sv \
locale-wget-tr \
locale-wget-uk \
locale-wget-vi \
locale-wget-zh-CN \
locale-wget-zh-TW \
wget-lang \
wget-lang-all"

RDEPENDS:${PN} += "wget"

inherit rpm
