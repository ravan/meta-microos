SUMMARY = "Black only color emoji"
DESCRIPTION = "Black color only variation of Openmoji glyphs."
LICENSE = "CC-BY-SA-4.0"

PV = "13.1.0+git.1605265744.4a80b536e"

RPM_NAME = "OpenMoji-Black-13.1.0+git.1605265744.4a80b536e-1.14.noarch.rpm"
RPM_HASH = "1ad61fffdf975e091c867b6b42bee5013e34bf748cfe218a714708cab763ae5a05cae7c2c7c7f97823179dc9fcf8501635884068bf455db111dad4875d14118a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenMoji-Black"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
