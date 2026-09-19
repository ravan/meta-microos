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

RPM_NAME = "python314-cloudpickle-3.1.2-4.1.noarch.rpm"
RPM_HASH = "6018d5929c2a0bddd4a0297ec12df4bd52e677587f40df71783aca96da7e52ea1cbba4f03acad6ef7c7f453ef8b0d8fddf1025cab6496ce9e014766b06e708d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cloudpickle \
python314-cloudpickle \
python3dist-cloudpickle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
