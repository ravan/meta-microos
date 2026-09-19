SUMMARY = "Python utility belt containing simple tools"
DESCRIPTION = "A Python utility belt containing simple tools, a stdlib like feel, and extra batteries"
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "python314-ubelt-1.4.3-1.1.noarch.rpm"
RPM_HASH = "fc0a16177e5045cecb2fcb0a59eb44045be178ea9ec0f6ed6e9f9152398565ae396ebcec87bec1c9db6ea41aca0413d70c3b7bdfa4e6289f5e93fee8e6b6168d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ubelt \
python314-ubelt \
python3dist-ubelt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
