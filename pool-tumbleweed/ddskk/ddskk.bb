SUMMARY = "SKK (Simple Kana to Kanji Conversion Program) for Emacs"
DESCRIPTION = "SKK (Simple Kana to Kanji conversion program) is a Japanese input \
method for Emacs. ddskk (Daredevil SKK) is a version of SKK that is \
aggressively developed."
LICENSE = "GPL-2.0-or-later & SUSE-Permissive & SUSE-Public-Domain"

PV = "20250328"

RPM_NAME = "ddskk-20250328-3.4.noarch.rpm"
RPM_HASH = "00671c7f4f24ddbb1d0170a7b4c2bf2aecfcb1620e6e02ef1e60de8b9c59336cb5c89e2ca591cc67da2e458191259befd14e2b7295a9ed6468c942886f719a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ddskk \
ddskk \
locale-emacs-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
apel \
emacs \
skkdic"

inherit rpm
