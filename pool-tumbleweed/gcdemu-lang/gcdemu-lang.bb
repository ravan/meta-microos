SUMMARY = "Translations for package gcdemu"
DESCRIPTION = "Provides translations for the 'gcdemu' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.1"

RPM_NAME = "gcdemu-lang-3.3.1-1.3.noarch.rpm"
RPM_HASH = "3e7c3b6d8d4e7a817c8ff17b08b56c9a190257ed6d95d1365435a25112034c13e99aa897bbfdf9f801e94f64baf95dc3c3bad79cc41dca5677996636212ee320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcdemu-lang \
gcdemu-lang-all \
locale-gcdemu-de \
locale-gcdemu-fr \
locale-gcdemu-ka \
locale-gcdemu-ko \
locale-gcdemu-pl \
locale-gcdemu-pt-BR \
locale-gcdemu-ro \
locale-gcdemu-ru \
locale-gcdemu-sl \
locale-gcdemu-sv \
locale-gcdemu-zh-CN"

RDEPENDS:${PN} += "gcdemu"

inherit rpm
