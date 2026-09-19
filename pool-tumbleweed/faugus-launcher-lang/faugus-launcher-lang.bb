SUMMARY = "Translations for package faugus-launcher"
DESCRIPTION = "Provides translations for the 'faugus-launcher' package."
LICENSE = "MIT & CC-BY-4.0"

PV = "2.3.0"

RPM_NAME = "faugus-launcher-lang-2.3.0-1.1.noarch.rpm"
RPM_HASH = "798bc7b60d819a7e307d5a0205a3d8faed24268d6bf225e049946b9cb52ea114cc2ce54ef1ca6b5e3809789e0881b7c7fff568e0b0ac3fd34dd95343d35fb3ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faugus-launcher-lang \
faugus-launcher-lang-all \
locale-faugus-launcher-ar \
locale-faugus-launcher-bg \
locale-faugus-launcher-cs \
locale-faugus-launcher-de \
locale-faugus-launcher-es \
locale-faugus-launcher-fa \
locale-faugus-launcher-fi \
locale-faugus-launcher-fr \
locale-faugus-launcher-it \
locale-faugus-launcher-ja \
locale-faugus-launcher-ka \
locale-faugus-launcher-nb \
locale-faugus-launcher-ne \
locale-faugus-launcher-nl \
locale-faugus-launcher-pl \
locale-faugus-launcher-pt-BR \
locale-faugus-launcher-ro \
locale-faugus-launcher-ru \
locale-faugus-launcher-sr \
locale-faugus-launcher-sv \
locale-faugus-launcher-ta \
locale-faugus-launcher-tr \
locale-faugus-launcher-zh-CN \
locale-faugus-launcher-zh-TW"

RDEPENDS:${PN} += "faugus-launcher"

inherit rpm
