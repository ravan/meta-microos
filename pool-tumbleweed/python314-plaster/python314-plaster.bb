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

RPM_NAME = "python314-plaster-1.1.2-4.5.noarch.rpm"
RPM_HASH = "3bd2a29a7dd13e6ef2e90fe7ae28243250303dc6bd52fb4c07b4dab08a645090db3cd989264fb166e0c7f7087e50a16e150447c95948954b281639ccaa62c27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-plaster \
python314-plaster \
python3dist-plaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
