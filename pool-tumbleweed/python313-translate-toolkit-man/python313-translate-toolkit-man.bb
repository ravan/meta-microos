SUMMARY = "Tools and API to assist with translation and software localization"
DESCRIPTION = "The translate-toolkit-man package contains manual pages for translate-toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "3.19.9"

RPM_NAME = "python313-translate-toolkit-man-3.19.9-1.2.noarch.rpm"
RPM_HASH = "ea37562c231d2404709f4b8df4d66c8f725904411a8742a93e97f971a04bc7a161f0be8dca259fc962c7173def2cf24ec8617e484d40a63975f97f028c255138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translate-toolkit-man \
python313-translate-toolkit-man"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
gettext-runtime \
python313 \
python313-lxml \
python313-tomlkit \
python313-unicode-segmentation-rs \
translate-toolkit"

inherit rpm
