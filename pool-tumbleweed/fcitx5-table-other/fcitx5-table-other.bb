SUMMARY = "Other Non-Chinese table input methods for Fcitx5"
DESCRIPTION = "fcitx-table-other provides some other Non-Chinese table for Fcitx."
LICENSE = "GPL-3.0-only & LicenseRef-SUSE-Public-Domain"

PV = "5.1.7"

RPM_NAME = "fcitx5-table-other-5.1.7-1.2.noarch.rpm"
RPM_HASH = "f24d618ceb183e12f6a92d031202a237e09e2b61cb519eff4039668640e10a658c2b042524ab7d5be60d09a9941cdb9bf4b64ed90ed285e7bae5aa3d3744ab5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-amharic \
fcitx-table-arabic \
fcitx-table-cn-cns11643 \
fcitx-table-emoji \
fcitx-table-ipa-x-sampa \
fcitx-table-latex \
fcitx-table-malayalam-compose \
fcitx-table-malayalam-phonetic \
fcitx-table-other \
fcitx-table-ru-rustrad \
fcitx-table-ru-translit \
fcitx-table-ru-yawerty \
fcitx-table-tamil-remington \
fcitx-table-thai \
fcitx-table-ua-translit \
fcitx-table-vi-qr \
fcitx5-table-other"

RDEPENDS:${PN} += "fcitx5"

inherit rpm
