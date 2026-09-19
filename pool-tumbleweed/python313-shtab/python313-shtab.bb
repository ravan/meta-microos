SUMMARY = "Automagic shell tab completion for Python CLI applications"
DESCRIPTION = "Automagic shell tab completion for Python CLI applications"
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "python313-shtab-1.12.1-1.1.noarch.rpm"
RPM_HASH = "2c3d876dc2d45e9686c3bc6160f31d4fc0bf9e402ba60a80db6bbc8fc743558cd1f915675d79e5bee17d28223ffe896ec97756ec07a528cb91977fc0df88f339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shtab \
python3.13dist-shtab \
python313-shtab \
python3dist-shtab"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
