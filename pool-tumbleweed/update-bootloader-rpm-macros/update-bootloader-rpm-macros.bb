SUMMARY = "RPM macros for update-bootloader"
DESCRIPTION = "This package provides rpm macros for bootloader update in rpm scripts"
LICENSE = "GPL-3.0-or-later"

PV = "0"

RPM_NAME = "update-bootloader-rpm-macros-0-8.7.noarch.rpm"
RPM_HASH = "ee65e0a32a54f204dcf7ec16a39801ce5bb4b32d92e7deb4b25639fd9b60cb00c75a48bfb809bef4fd219fd160c6cc94d9a0ae4a26b0b828ff81f98da94cb275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-update-bootloader-check-type-refresh-post \
rpm-macro-update-bootloader-check-type-reinit-post \
rpm-macro-update-bootloader-posttrans \
rpm-macro-update-bootloader-refresh-post \
rpm-macro-update-bootloader-reinit-post \
rpm-macro-update-bootloader-requires \
update-bootloader-rpm-macros"

RDEPENDS:${PN} += ""

inherit rpm
