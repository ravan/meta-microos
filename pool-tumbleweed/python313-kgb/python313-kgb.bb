SUMMARY = "Function spies for Python unit tests"
DESCRIPTION = "kgb installs spies onto functions and methods, letting Python unit \
tests assert how and how often a function was called, transparently \
record or fake its behaviour, and inspect the arguments it received."
LICENSE = "MIT"

PV = "7.3"

RPM_NAME = "python313-kgb-7.3-1.2.noarch.rpm"
RPM_HASH = "ba94aa11b263d4ec4dab856db53702dd3e1bdda2dbefc7894fc8940e48beb03d76bab05017009ae1f77088b1e88bf8174b649583860ee228b3af56596608f7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kgb \
python3.13dist-kgb \
python313-kgb \
python3dist-kgb"

RDEPENDS:${PN} += "python-abi"

inherit rpm
