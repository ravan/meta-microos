SUMMARY = "Translations for package gkrellm"
DESCRIPTION = "Provides translations for the 'gkrellm' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.1"

RPM_NAME = "gkrellm-lang-2.5.1-1.3.noarch.rpm"
RPM_HASH = "5bec20ffc8675bd8f4f74b5fb165c76eb11591f69ee3e5d830641aa3135472ae36a653ec3990bce73daea11b234752c04badcfc403ce7f0e8edab82b1f3c3bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gkrellm-lang \
gkrellm-lang-all \
locale-gkrellm-bg \
locale-gkrellm-cs \
locale-gkrellm-da \
locale-gkrellm-de \
locale-gkrellm-es \
locale-gkrellm-fr \
locale-gkrellm-it \
locale-gkrellm-ja \
locale-gkrellm-nl \
locale-gkrellm-pl \
locale-gkrellm-pt \
locale-gkrellm-pt-BR \
locale-gkrellm-ru \
locale-gkrellm-sl \
locale-gkrellm-sv \
locale-gkrellm-uk"

RDEPENDS:${PN} += "gkrellm"

inherit rpm
