SUMMARY = "Python parser for ds9 region files"
DESCRIPTION = "pyregion is a python module to parse ds9 region files. It also supports ciao region files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-pyregion-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "fe4188c3f0288a5badad4c48e85e129e2c047c3bddd79ce4fca57830a3e1bf994461504d7fe2f6ecff13a117cad7f1cff145918e1ccf1ce285e4fd04694457c5"

RPROVIDES:${PN} += "python3-pyregion \
python3.13dist-pyregion \
python313-pyregion \
python3dist-pyregion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-astropy \
python313-numpy \
python313-pyparsing"

inherit rpm
