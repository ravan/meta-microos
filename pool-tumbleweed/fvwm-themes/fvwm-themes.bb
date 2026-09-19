SUMMARY = "FVWM Configuration Framework"
DESCRIPTION = "FVWM Themes is a powerful configuration framework for FVWM, designed to \
be easily extendable and configurable.	It includes several prebuilt \
themes and a pack of images and sounds."
LICENSE = "GPL-2.0+"

PV = "0.7.0"

RPM_NAME = "fvwm-themes-0.7.0-42.7.noarch.rpm"
RPM_HASH = "cda74ff6f91a583dd8c64f8ba84d7d54185abd25d8e8141a712b3627aff5a871b54d4ab8df07ecc1782828d91fd42d8c4e335a3febc4fb77ef4940834115d22b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fvwm-themes"

RDEPENDS:${PN} += "/usr/bin/mkfifo \
/usr/bin/perl \
/usr/bin/sh \
fvwm2 \
perl"

inherit rpm
