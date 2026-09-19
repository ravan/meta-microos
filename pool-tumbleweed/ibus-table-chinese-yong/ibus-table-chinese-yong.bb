SUMMARY = "YongMa input method"
DESCRIPTION = "YongMa input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.14"

RPM_NAME = "ibus-table-chinese-yong-1.8.14-1.6.noarch.rpm"
RPM_HASH = "b4ca6845d003885ce99889b613d102eb0438ccca92c9cb14959c5e59f820d4b6d18c4c90ab09374fe90b29571e5c277a7d9818865f8a8a4c503c07e9e929e422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-yong \
ibus-table-yong \
locale-ibus-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh \
ibus-table"

inherit rpm
