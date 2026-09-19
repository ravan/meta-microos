SUMMARY = "Translations for package iotas"
DESCRIPTION = "Provides translations for the 'iotas' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.7"

RPM_NAME = "iotas-lang-0.12.7-1.2.noarch.rpm"
RPM_HASH = "06c36b1fd4a6285f67bd837471e01c5cab099d428c0b2e2ead09e3fdfd376cec11ebf39a04c7539b03f2ad8e8ae6f5939afca5d1a8a0b03f8a02e6996f764eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iotas-lang \
iotas-lang-all \
locale-iotas-bg \
locale-iotas-ca \
locale-iotas-cs \
locale-iotas-de \
locale-iotas-el \
locale-iotas-en-GB \
locale-iotas-es \
locale-iotas-eu \
locale-iotas-fi \
locale-iotas-fr \
locale-iotas-he \
locale-iotas-hu \
locale-iotas-it \
locale-iotas-ka \
locale-iotas-nl \
locale-iotas-oc \
locale-iotas-pt-BR \
locale-iotas-ro \
locale-iotas-ru \
locale-iotas-sl \
locale-iotas-sv \
locale-iotas-tr \
locale-iotas-uk \
locale-iotas-zh-CN"

RDEPENDS:${PN} += "iotas"

inherit rpm
