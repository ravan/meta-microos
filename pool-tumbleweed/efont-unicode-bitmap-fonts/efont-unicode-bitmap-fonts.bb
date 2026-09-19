SUMMARY = "Unicode Font by /efont/"
DESCRIPTION = "Unicode fonts developed by /efont/ openlab. This font package includes \
12,14, 16, and 24 pixel ISO-10646 fonts."
LICENSE = "SUSE-Public-Domain & BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "efont-unicode-bitmap-fonts-0.4.2-229.7.noarch.rpm"
RPM_HASH = "4bb79c03df2595bdd2fd2159d45643c895f6d372eae678025ed57f2241d5e650bb94f65f459d5761fe978a948b76cc055d085ec45379c17470f13b20326aa8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "efont-unicode \
efont-unicode-bitmap-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
mkfontdir \
perl"

inherit rpm
