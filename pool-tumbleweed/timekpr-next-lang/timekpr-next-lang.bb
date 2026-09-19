SUMMARY = "Translations for package timekpr-next"
DESCRIPTION = "Provides translations for the 'timekpr-next' package."
LICENSE = "GPL-3.0-only"

PV = "0.5.8"

RPM_NAME = "timekpr-next-lang-0.5.8-1.4.noarch.rpm"
RPM_HASH = "c632634b081c405d7882d33bbe0b104ae5308de1a3dc0209acd77c83b3778b7a802799b6eebe940a156986c1165b723c1601774b7172b6bf8e0f579b046d2cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-timekpr-next-be \
locale-timekpr-next-de \
locale-timekpr-next-es \
locale-timekpr-next-fr \
locale-timekpr-next-it \
locale-timekpr-next-lv \
locale-timekpr-next-nl \
locale-timekpr-next-pt \
locale-timekpr-next-ru \
timekpr-next-lang \
timekpr-next-lang-all"

RDEPENDS:${PN} += "timekpr-next"

inherit rpm
