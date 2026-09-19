SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python314-pymediainfo-7.0.1-1.8.noarch.rpm"
RPM_HASH = "13a8816be9b479be207e0e257d1f18094218ccaf221a7b5552fc5e6b36c0b454998f406d8a7729834d4dc386e3d749156c3eba26b20a9aea6e78b79df16b5024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pymediainfo \
python314-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
