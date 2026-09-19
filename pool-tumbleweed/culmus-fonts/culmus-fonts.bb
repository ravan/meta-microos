SUMMARY = "A set of Hebrew fonts"
DESCRIPTION = "A set of 15 Hebrew font families. Those families provide a basic set \
of a serif (Frank Ruehl), sans serif (Nachlieli), and monospaced \
(Miriam Mono) fonts. ASCII glyphs are partially borrowed from the URW \
and Bitstream fonts. Also included Miriam, Drugulin, Aharoni, David, \
Yehuda, and Ellinia."
LICENSE = "GPL-2.0-or-later"

PV = "0.140"

RPM_NAME = "culmus-fonts-0.140-1.3.noarch.rpm"
RPM_HASH = "e9a04a18dd506362242fb60a72514798f3561daf4d7eff75eec6135a40476a632875d5c3bcdbf78d6b94dc3552cfee6b35de19542285856fb3075156cba75084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "culmus-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
