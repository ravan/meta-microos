SUMMARY = "Serif Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Serif is a transitional serif face with humanistic terminals designed \
for use together with PT Sans and harmonized with PT Sans on metrics, \
proportions, weights and design. PT Serif consists of six styles: \
regular and bold weights with corresponding italics form a standard \
computer font family for basic text setting; two caption styles (regular \
and italic) are for texts of small point sizes. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "1.002OFL"

RPM_NAME = "paratype-pt-serif-fonts-1.002OFL-3.25.noarch.rpm"
RPM_HASH = "e8fd1bb83855cb9090ab690dd8a1805008b410032391252ff8c5508df75a398781bb03f73e9fbf6c5a2988dfd29636a6fe5ffe1c937fbda866c346def4921a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PTSerif-fonts \
locale-be;ru;uk \
paratype-pt-serif-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
