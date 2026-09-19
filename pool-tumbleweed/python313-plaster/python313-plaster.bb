SUMMARY = "A loader interface around multiple config file formats"
DESCRIPTION = "Plaster is a loader interface around multiple config file formats. \
It exists to define a common API for applications to use when they \
wish to load a configuration. The library itself does not aim to \
handle anything except a basic API that applications may use to find \
and load configuration settings. Any specific constraints should be \
implemented in a pluggable loader which can be registered via an \
entrypoint."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python313-plaster-1.1.2-4.5.noarch.rpm"
RPM_HASH = "32fd3e782e522b786523b75b21a16d548e810771820ad22a9d2465511026667a1d0f8c55df257712c40f8abb8d469dbbd7632272ad8ea5fbb6d07342e8920d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-plaster \
python3.13dist-plaster \
python313-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
