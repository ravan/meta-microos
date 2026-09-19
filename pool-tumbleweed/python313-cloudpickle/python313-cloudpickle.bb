SUMMARY = "Extended pickling support for Python objects"
DESCRIPTION = "The cloudpickle package makes it possible to serialize Python constructs \
not supported by the default pickle module from the Python standard \
library. \
 \
cloudpickle is especially useful for cluster computing where Python \
expressions are shipped over the network to execute on remote hosts, \
possibly close to the data. \
 \
Among other things, cloudpickle supports pickling for lambda expressions, \
functions and classes defined interactively in the __main__ module."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "python313-cloudpickle-3.1.2-4.1.noarch.rpm"
RPM_HASH = "8021e5596b58ebacebaa69e951d6d4f159156153fff6ea8f1bb8ceaeb8a1b8aa8cc8f1a475d529eaa91db6e0842c635d3336b336c52143275abdf0a9b16b70ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloudpickle \
python3.13dist-cloudpickle \
python313-cloudpickle \
python3dist-cloudpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
