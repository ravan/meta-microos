SUMMARY = "Noto Tifinagh Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tifinagh Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-tifinagh-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "d2efefdad3a114e0ccf33426aa03deecd3e3a733721a6d5728328681e30f6c404972962aa054353a6d50c82f883d4e3778c195574e8a66f4a07f2d753a2d0870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tifinagh-fonts \
noto-sans-tifinagh \
noto-sans-tifinagh-fonts \
noto-sans-tifinaghadrar \
noto-sans-tifinaghadrar-fonts \
noto-sans-tifinaghagrawimazighen \
noto-sans-tifinaghagrawimazighen-fonts \
noto-sans-tifinaghahaggar \
noto-sans-tifinaghahaggar-fonts \
noto-sans-tifinaghair \
noto-sans-tifinaghair-fonts \
noto-sans-tifinaghapt \
noto-sans-tifinaghapt-fonts \
noto-sans-tifinaghazawagh \
noto-sans-tifinaghazawagh-fonts \
noto-sans-tifinaghghat \
noto-sans-tifinaghghat-fonts \
noto-sans-tifinaghhawad \
noto-sans-tifinaghhawad-fonts \
noto-sans-tifinaghrhissaixa \
noto-sans-tifinaghrhissaixa-fonts \
noto-sans-tifinaghsil \
noto-sans-tifinaghsil-fonts \
noto-sans-tifinaghtawellemmet \
noto-sans-tifinaghtawellemmet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
