SUMMARY = "Colorize commands output or STDIN using patterns"
DESCRIPTION = "Easily colorize logs or commands output using patterns."
LICENSE = "GPL-3.0-or-later"

PV = "2.8.0"

RPM_NAME = "rainbow-2.8.0-1.13.noarch.rpm"
RPM_HASH = "4f1fe6ed4113b2aac85b0840a229d1400274deb75369cd5da8d2b4eae1b6e19cb15268a89626c6e1b8482f1537632fd7b6d7f4b2b193942e21e368f76c37c9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-rainbow \
python3dist-rainbow \
rainbow"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
