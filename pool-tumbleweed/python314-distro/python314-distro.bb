SUMMARY = "Linux Distribution - a Linux OS platform information API"
DESCRIPTION = "distro (for: Linux Distribution) provides information about the Linux distribution it runs on, such as a reliable machine-readable ID, or version information. \
 \
It is a renewed alternative implementation for Python's original platform.linux_distribution function, but it also provides much more functionality which isn't necessarily Python bound like a command-line interface."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python314-distro-1.9.0-4.7.noarch.rpm"
RPM_HASH = "c38065c5f260154881befdd81b8fdc2cebd8a684a8dbdd5085f80f5d206ab2277fee520c4dcc6104a7a88245e9da41b7189c80bc61573af5ff200545f382747a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-distro \
python314-distro \
python3dist-distro"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
