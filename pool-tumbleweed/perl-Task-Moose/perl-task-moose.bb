SUMMARY = "Moose in a box"
DESCRIPTION = "This Task installs Moose and then optionally installs a number of Moose \
extensions listed below. This list is meant to be comprehensive, so if I \
missed something please let me know."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Task-Moose-0.03-11.12.noarch.rpm"
RPM_HASH = "e1f3e05c277131220d38403b8fbd30c05f016804edf67bb049a72f0f9ecde8dc962f8eb14276e76223ec07d79a7740de2d9f37850e2fe39afd0e6fe61a586126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Moose \
perl-Task-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Moose"

inherit rpm
