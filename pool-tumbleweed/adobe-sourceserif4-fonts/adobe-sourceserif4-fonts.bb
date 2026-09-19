SUMMARY = "A set of OpenType fonts designed for user interfaces"
DESCRIPTION = "A set of serif OpenType fonts designed to complement Source Sans"
LICENSE = "OFL-1.1"

PV = "4.005"

RPM_NAME = "adobe-sourceserif4-fonts-4.005-1.9.noarch.rpm"
RPM_HASH = "28a5fd59a60903ef97c08ec42c57005b693881e625101c3bafd5485dfb7e83fdc924d18c76a4e297c091ffdd1a01a1c17443f95c400cb4a7e61b1030fc3c0b91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourceserif4-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
