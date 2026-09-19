SUMMARY = "Translations for package webkitgtk3"
DESCRIPTION = "Provides translations for the 'webkitgtk3' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.52.6"

RPM_NAME = "WebKitGTK-4.1-lang-2.52.6-1.2.noarch.rpm"
RPM_HASH = "da0a1e9182f5176f8fa656e170d89af03e35f5d69af6d3b0a79b50491b09784734b86199a33ec913099ec57fe6f87634348e8a76f81796d743ccf3ad1202d50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WebKitGTK-4.1-lang \
WebKitGTK-4.1-lang-all \
locale-WebKitGTK-4.1-ar \
locale-WebKitGTK-4.1-as \
locale-WebKitGTK-4.1-bg \
locale-WebKitGTK-4.1-ca \
locale-WebKitGTK-4.1-cs \
locale-WebKitGTK-4.1-da \
locale-WebKitGTK-4.1-de \
locale-WebKitGTK-4.1-el \
locale-WebKitGTK-4.1-en-CA \
locale-WebKitGTK-4.1-en-GB \
locale-WebKitGTK-4.1-eo \
locale-WebKitGTK-4.1-es \
locale-WebKitGTK-4.1-et \
locale-WebKitGTK-4.1-eu \
locale-WebKitGTK-4.1-fi \
locale-WebKitGTK-4.1-fr \
locale-WebKitGTK-4.1-gl \
locale-WebKitGTK-4.1-gu \
locale-WebKitGTK-4.1-he \
locale-WebKitGTK-4.1-hi \
locale-WebKitGTK-4.1-hr \
locale-WebKitGTK-4.1-hu \
locale-WebKitGTK-4.1-id \
locale-WebKitGTK-4.1-it \
locale-WebKitGTK-4.1-ja \
locale-WebKitGTK-4.1-ka \
locale-WebKitGTK-4.1-kk \
locale-WebKitGTK-4.1-kn \
locale-WebKitGTK-4.1-ko \
locale-WebKitGTK-4.1-lt \
locale-WebKitGTK-4.1-lv \
locale-WebKitGTK-4.1-ml \
locale-WebKitGTK-4.1-mr \
locale-WebKitGTK-4.1-nb \
locale-WebKitGTK-4.1-nl \
locale-WebKitGTK-4.1-or \
locale-WebKitGTK-4.1-pa \
locale-WebKitGTK-4.1-pl \
locale-WebKitGTK-4.1-pt \
locale-WebKitGTK-4.1-pt-BR \
locale-WebKitGTK-4.1-ro \
locale-WebKitGTK-4.1-ru \
locale-WebKitGTK-4.1-sl \
locale-WebKitGTK-4.1-sr \
locale-WebKitGTK-4.1-sr@latin \
locale-WebKitGTK-4.1-sv \
locale-WebKitGTK-4.1-ta \
locale-WebKitGTK-4.1-te \
locale-WebKitGTK-4.1-tr \
locale-WebKitGTK-4.1-uk \
locale-WebKitGTK-4.1-vi \
locale-WebKitGTK-4.1-zh-CN"

RDEPENDS:${PN} += "WebKitGTK-4.1"

inherit rpm
