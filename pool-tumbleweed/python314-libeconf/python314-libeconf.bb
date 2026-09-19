SUMMARY = "Python bindings for libeconf"
DESCRIPTION = "Python bindings for libeconf"
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python314-libeconf-0.8.4-1.1.noarch.rpm"
RPM_HASH = "716aee8ae9454fb8ef26c5b3aa71f2f5236d73d91a83c6067a505e5dc3562b03c80caf49c29f5fdb7b3d48f74e93a570038f9c728a0a2ab0ea8ad425921f264c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-libeconf \
python314-libeconf \
python3dist-python-libeconf"

RDEPENDS:${PN} += "libeconf0 \
python-abi"

inherit rpm
