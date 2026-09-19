SUMMARY = "Wu pronunciation input method"
DESCRIPTION = "Wu pronunciation input method. \
URL: http://input.foruto.com/wu/"
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-wu-1.8.14-1.6.noarch.rpm"
RPM_HASH = "99cb0fcfa794d0d221d767cc6ae5b11e97c8e22fa4c61d08ac8cd4f5abac731bf96761f11fc7704f484095514e98deca3b4b06d96ae541ee90c17fe568cbf56e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-wu \
ibus-table-wu \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
