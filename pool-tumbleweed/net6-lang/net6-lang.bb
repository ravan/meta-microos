SUMMARY = "Translations for package net6"
DESCRIPTION = "Provides translations for the 'net6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.14"

RPM_NAME = "net6-lang-1.3.14-13.9.noarch.rpm"
RPM_HASH = "f4c984e46da02ef3a7570f753dbff0d07356101de40fc22d4a85a8d6cddcdc0bcce15bb72227d12fb3926fae35253b86b5454d7157e52273092ec6b157db2b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-net6-ast \
locale-net6-de \
locale-net6-en-GB \
locale-net6-es \
locale-net6-fr \
locale-net6-he \
locale-net6-it \
locale-net6-ko \
locale-net6-nb \
locale-net6-nl \
locale-net6-pt \
locale-net6-pt-BR \
locale-net6-ru \
locale-net6-sk \
locale-net6-sv \
locale-net6-uk \
locale-net6-zh-CN \
net6-lang \
net6-lang-all"

RDEPENDS:${PN} += "net6"

inherit rpm
