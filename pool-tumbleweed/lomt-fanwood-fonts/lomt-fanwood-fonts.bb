SUMMARY = "League Of Movable Type's 'Fanwood' font family"
DESCRIPTION = "This serif font is based on work of a famous Czech-American type \
designer of yesteryear. The package includes roman and italic."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-fanwood-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "42c1f273655d47d89f4c04f5daefe3acc381cd472e663063d7ce644265ba21d5ae4a488f2bc6a3c8cd0312d5371ad4c40e4e9f8a8327fdf0714224eddb568d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-fanwood-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
