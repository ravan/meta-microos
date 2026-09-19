SUMMARY = "Smart replacement for plain tuple used in __version__"
DESCRIPTION = "Smart replacement for plain tuple used in __version__. \
 \
* Keep a *single version definition* inside your package or module \
* Get proper versioning of development snapshots coupled with your \
  Version Control System (pluggable support for additional systems \
  available) \
* Produce nice version strings for released files that are compliant \
  with PEP 386 \
* Remain comparable as tuple of integers"
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.1"

RPM_NAME = "python314-versiontools-1.9.1-15.5.noarch.rpm"
RPM_HASH = "5c8079589add65722d8db62d7b7d90bef1ffb96dd64a0b6c3d7949d32c7737c878d009a252bf50425031b0071147b87cb08e29e1f9d9eeb32b377e8febbc6ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-versiontools \
python314-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python314-setuptools"

inherit rpm
