SUMMARY = "A serif font for everyday use"
DESCRIPTION = "Vollkorn is a text face with dark and meaty serifs and a bouncing look. \
It might be used as body type as well as for headlines or titles. \
 \
('Vollkorn' is German for »wholemeal« which refers to the old term \
'Brotschrift'.)"
LICENSE = "OFL-1.1"

PV = "4.105"

RPM_NAME = "vollkorn-fonts-4.105-2.19.noarch.rpm"
RPM_HASH = "1124623f11929190a9a20ffc05975c1b0dded9a0f12f14575dca0ff99b74e9a93e34c9f5f5c21273443f079710d31a26d9891394f19fd12a7c321e3ab2f4d4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vollkorn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
