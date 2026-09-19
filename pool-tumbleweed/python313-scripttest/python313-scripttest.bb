SUMMARY = "Helper to test command-line scripts"
DESCRIPTION = "scripttest is a library to help you test your interactive command-line \
applications. \
 \
With it you can easily run the command (in a subprocess) and see the \
output (stdout, stderr) and any file modifications."
LICENSE = "MIT"

PV = "2.0.post1"

RPM_NAME = "python313-scripttest-2.0.post1-1.2.noarch.rpm"
RPM_HASH = "781b7fa7c982bbf66bac46a7fe1b93cc0c4c63a4951dd0b11164c4c856066830b1b21acdf98f333c4f337af5b0e9eb7d17f86e49078574193a113557d7a7ee32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scripttest \
python3.13dist-scripttest \
python313-scripttest \
python3dist-scripttest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
