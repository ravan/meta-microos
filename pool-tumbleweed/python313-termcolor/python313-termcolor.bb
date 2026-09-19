SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python313-termcolor-3.3.0-1.5.noarch.rpm"
RPM_HASH = "99f994a832a053599fa59b1f1171d32c618f7a31ac88f93f74c0b3e2f1bae64b35a5f6fd09a51b3449ff15d660653117fb9c87919086b2c68cd68967161421c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-termcolor \
python3.13dist-termcolor \
python313-termcolor \
python3dist-termcolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
