SUMMARY = "Hatch build hook plugin to generate manual pages"
DESCRIPTION = "A Hatch build hook plugin that automatically generates manual pages \
from argparse-based command-line interfaces during the build process."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "python313-hatch-argparse-manpage-1.0.1-1.3.noarch.rpm"
RPM_HASH = "a9b340567b92ac5fe6cddcbd5404ef62dcd17df0e3d9a0169fe314aa24f245b060aec25c9f42d6990e776fe5c354aa816c34ad533471fb1a1b3c24d15d46140a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-argparse-manpage \
python3.13dist-hatch-argparse-manpage \
python313-hatch-argparse-manpage \
python3dist-hatch-argparse-manpage"

RDEPENDS:${PN} += "python-abi \
python313-argparse-manpage \
python313-rich"

inherit rpm
