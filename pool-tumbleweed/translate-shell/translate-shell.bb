SUMMARY = "Command line translator using various online services as backends"
DESCRIPTION = "Translate Shell is a command-line translator powered by \
Google Translate, Bing Translator, Yandex.Translate and DeepL \
traslator. It gives access to online translation services \
from a terminal."
LICENSE = "Unlicense"

PV = "0.9.7.1"

RPM_NAME = "translate-shell-0.9.7.1-1.9.noarch.rpm"
RPM_HASH = "5d7f0514c5ed121d57fedeb294351ee92dee5d90d3c8981c0bffc9f966171b92d7348894642fb90ccade9f2635691dcb76d5dca3a8765e982ea5321d54ab2ce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translate-shell"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
gawk"

inherit rpm
