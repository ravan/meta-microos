SUMMARY = "League Of Movable Type's 'Knewave' font family"
DESCRIPTION = "Knewave is a bold, painted font face."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-knewave-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "94b7a90e7ab19bba978384af945d0564b03f8fab78265d6235091de9c1fe5c0b52e0d1fcae6c78084c04fb1d3512cb071dc9fbca195abf0ff05177e31de3ee50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-knewave-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
