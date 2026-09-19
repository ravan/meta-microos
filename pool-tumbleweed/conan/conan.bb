SUMMARY = "A C/C++ package manager"
DESCRIPTION = "Conan is a package manager for C and C++ developers. It is specifically \
designed and optimized for accelerating the development and Continuous \
Integration of C and C++ projects."
LICENSE = "MIT"

PV = "2.32.0"

RPM_NAME = "conan-2.32.0-1.1.noarch.rpm"
RPM_HASH = "0c032c6ff1d69f8ab8b7cf62f0a498817969049e2a137a51695bf5767a0dd05ce3068b5cad573e0d3889cb593cce13454e82cc9d2fed2c995b469db3c55d8781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conan \
python3.13dist-conan \
python3dist-conan"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-colorama \
python3-distro \
python3-fasteners \
python3-patch-ng \
python3-python-dateutil \
python3-requests \
python3-urllib3"

inherit rpm
