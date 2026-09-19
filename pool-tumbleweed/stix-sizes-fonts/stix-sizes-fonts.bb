SUMMARY = "STIX scientific and engineering fonts, additional glyph sizes"
DESCRIPTION = "This package includes fonts containing glyphs in additional sizes (Mostly \
'fence' and 'piece' glyphs)."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-sizes-fonts-1.1.0-12.26.noarch.rpm"
RPM_HASH = "62634c145f5516233a48849238604a26a7908ad0751498604fa38ebf905e3bf657b847682bacebb629048fcc5ff04ce88021aa1d59066d1ec9a757b431f8acef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-stix-sizes-fonts \
font-stixsizefivesym \
font-stixsizefoursym \
font-stixsizeonesym \
font-stixsizethreesym \
font-stixsizetwosym \
stix-sizes-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl \
stix-fonts"

inherit rpm
