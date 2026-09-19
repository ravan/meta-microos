SUMMARY = "Tools and API to assist with translation and software localization"
DESCRIPTION = "The translate-toolkit-man package contains manual pages for translate-toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "3.19.9"

RPM_NAME = "python314-translate-toolkit-man-3.19.9-1.2.noarch.rpm"
RPM_HASH = "6aa762cf297d0e476bbf2629fb680e6ce53dda7f676ba0314f4d02b3a9ae7701358ea7e36b2f98b21037c1c94b3b080b3c8ed26caef148b393c35733c4765776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-translate-toolkit-man"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
gettext-runtime \
python314 \
python314-lxml \
python314-tomlkit \
python314-unicode-segmentation-rs \
translate-toolkit"

inherit rpm
