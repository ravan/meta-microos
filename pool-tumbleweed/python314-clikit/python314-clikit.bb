SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python314-clikit-0.6.2-3.11.noarch.rpm"
RPM_HASH = "c210c8f0a5eba4ffd4356a76008e71b140678742e2421aacb903784c6ad29f75ebbd146f8db016d2543c3e86f9a0b713312ab5004ba0fddb212e06b721b3a663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-clikit \
python314-clikit \
python3dist-clikit"

RDEPENDS:${PN} += "python-abi \
python314-crashtest \
python314-pastel \
python314-pylev"

inherit rpm
