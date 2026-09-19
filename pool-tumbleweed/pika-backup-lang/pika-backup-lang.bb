SUMMARY = "Translations for package pika-backup"
DESCRIPTION = "Provides translations for the 'pika-backup' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.4"

RPM_NAME = "pika-backup-lang-0.8.4-1.2.noarch.rpm"
RPM_HASH = "6f857820924f3e244ed91f4e46b83ddf37901845de457ee3d8a7ef62f8dc9b53cecd4496086ffa8a3bacf29116bc46a073eb513bcf1fb2aad206ef54404617e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pika-backup-bg \
locale-pika-backup-ca \
locale-pika-backup-cs \
locale-pika-backup-da \
locale-pika-backup-de \
locale-pika-backup-el \
locale-pika-backup-en-GB \
locale-pika-backup-eo \
locale-pika-backup-es \
locale-pika-backup-eu \
locale-pika-backup-fa \
locale-pika-backup-fi \
locale-pika-backup-fr \
locale-pika-backup-gl \
locale-pika-backup-he \
locale-pika-backup-hi \
locale-pika-backup-hr \
locale-pika-backup-hu \
locale-pika-backup-id \
locale-pika-backup-is \
locale-pika-backup-it \
locale-pika-backup-ka \
locale-pika-backup-kk \
locale-pika-backup-ko \
locale-pika-backup-nl \
locale-pika-backup-oc \
locale-pika-backup-pl \
locale-pika-backup-pt \
locale-pika-backup-pt-BR \
locale-pika-backup-ro \
locale-pika-backup-ru \
locale-pika-backup-sl \
locale-pika-backup-sr \
locale-pika-backup-sv \
locale-pika-backup-tr \
locale-pika-backup-uk \
locale-pika-backup-vi \
locale-pika-backup-zh-CN \
pika-backup-lang \
pika-backup-lang-all"

RDEPENDS:${PN} += "pika-backup"

inherit rpm
