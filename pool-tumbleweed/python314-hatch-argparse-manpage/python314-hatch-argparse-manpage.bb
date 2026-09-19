SUMMARY = "Hatch build hook plugin to generate manual pages"
DESCRIPTION = "A Hatch build hook plugin that automatically generates manual pages \
from argparse-based command-line interfaces during the build process."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "python314-hatch-argparse-manpage-1.0.1-1.3.noarch.rpm"
RPM_HASH = "1ae09629e41273efa77429817699cd24710be33e0266a5c0547376eb93de9a322e5e8d8556a99fe5e451ca78d6996aade4d95e39d03b2646c0e739b9a4060b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-argparse-manpage \
python314-hatch-argparse-manpage \
python3dist-hatch-argparse-manpage"

RDEPENDS:${PN} += "python-abi \
python314-argparse-manpage \
python314-rich"

inherit rpm
