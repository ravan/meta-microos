SUMMARY = "Unicode Version of the Computer Modern Fonts"
DESCRIPTION = "Computer Modern Unicode fonts were converted from metafont sources \
using [1] textrace and [2] pfaedit (030404). Their main purpose is to \
create free good quality fonts for use in X Window System applications \
supporting many languages. Currently the fonts contain glyphs from \
Latin1 (Metafont ec, tc), Cyrillic (la, rx) and Greek (cbgreek when \
available) code sets."
LICENSE = "OFL-1.1"

PV = "0.7.0"

RPM_NAME = "cm-unicode-fonts-0.7.0-196.3.noarch.rpm"
RPM_HASH = "11949935b8981d6a7882435835945c81b07ab86ce062105cf48415af120536edd53fc5078e1a15831746e9d5123e209eaa1ee041df84571ffc6866555036895a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cm-unicode \
cm-unicode-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
