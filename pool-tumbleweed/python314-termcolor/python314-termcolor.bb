SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python314-termcolor-3.3.0-1.5.noarch.rpm"
RPM_HASH = "cb4b1d4a04f0d6b051676e190350965f6be3dd0b9b8b3427fcf312f828b88eb55d9877dd1c5db9cceac7f97c732efff7da397c2b486b10b8d6d20abb75baea79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-termcolor \
python314-termcolor \
python3dist-termcolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
