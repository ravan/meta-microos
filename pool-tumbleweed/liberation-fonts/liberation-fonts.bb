SUMMARY = "Liberation Fonts"
DESCRIPTION = "Free fonts which are metric-compatible to 'Arial', 'Times New Roman' \
and 'Courier New'."
LICENSE = "SUSE-Liberation"

PV = "2.1.5"

RPM_NAME = "liberation-fonts-2.1.5-1.14.noarch.rpm"
RPM_HASH = "51bb1d85c663b05ba497796b475e035f767b03608f61bf142168aa998403c5825f09b1cba9512ec3660a5fa949034c9116bed226ca4b9bed07dcd99b57abe1f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liberation-fonts \
locale-bg;el;ru;bg"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
