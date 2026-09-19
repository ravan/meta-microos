SUMMARY = "Little Korean <-> English Dictionary"
DESCRIPTION = "Little Korean <-> English dictionary."
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "engdic-0.2-145.7.noarch.rpm"
RPM_HASH = "2eb8d7b970a099665a5b8c3034d809e51e6bfc4f5da2ff94064e7e31760ea7e79406840439b068d6a616276eaebd4e26784e987b034f0347d320f9d6ea1c7ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engdic"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
