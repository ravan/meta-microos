SUMMARY = "Mozilla’s Fira Type Family"
DESCRIPTION = "Fira Sans (née Feura Sans) is a friendly free sans-serif font designed \
for Firefox OS. It looks very similar to FF Meta, but has a larger \
x-height to improve on-screen appearance. (Available in 16 weights, each \
with accompanying italics.) \
This package also contains Fira Sans Condensed, 16% more compact, and \
Fira Mono, a monospaced semi-serif font with a matching design. \
(Available in three weights, without italics.) \
 \
Designers: Ralph du Carrois & Erik Spiekermann."
LICENSE = "OFL-1.1"

PV = "4.202"

RPM_NAME = "mozilla-fira-fonts-4.202-1.7.noarch.rpm"
RPM_HASH = "023ec08abb9a1da94823e214a49a71e568657d4f51eb7d871988cdec9747f5545ae2c2e3dfb570f7f38a01e75d9b8214e6c67992147e07d265caa6b289bbf272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozilla-feura-sans-fonts \
mozilla-fira-fonts \
mozilla-fira-sans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
