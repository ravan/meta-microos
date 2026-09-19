SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python313-distro-1.9.0-4.7.noarch.rpm"
RPM_HASH = "4981725555a5af84d8629b08c94090736e92c410b44f6411ca0050862cf51435bb58aca1ceee85be178a87fca5f314d3c91fc3be991f7658ff7375837111c0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distro \
python3.13dist-distro \
python313-distro \
python3dist-distro"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
