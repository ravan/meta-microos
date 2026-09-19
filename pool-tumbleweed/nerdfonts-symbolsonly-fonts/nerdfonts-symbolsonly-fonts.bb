SUMMARY = "The Nerd Fonts symbol set, without base (letter) glyphs"
DESCRIPTION = "Nerd Fonts takes popular programming fonts and adds a fair number of \
dingbat glyphs (symbols, ornamentations, etc.) \
This package contains a font with dingbats only, and without any \
letter glyphs (e.g. Latin)."
LICENSE = "Apache-2.0 & CC-BY-4.0 & MIT & OFL-1.1-no-RFN & LicenseRef-SUSE-Freeware"

PV = "3.5.0"

RPM_NAME = "nerdfonts-symbolsonly-fonts-3.5.0-1.1.noarch.rpm"
RPM_HASH = "8d9d7172e1eb5e87571d262f5f640b75ed81290377b036984d49529e8334051f8758009123206ae5a6989fd2f27248e056baa630241cc2a8d1b8f87d40b98f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nerdfonts-symbolsonly-fonts \
symbols-only-nerd-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
