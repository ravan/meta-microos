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

RPM_NAME = "python313-versiontools-1.9.1-15.5.noarch.rpm"
RPM_HASH = "3de0964af37c5572dd633b09e06afbcdfb0fb08387a55c054a40fb82f9a8ee9a1d845aa3fa1ddc4a91270b378b26fd459eb9363717d00ecd2a1e04934d4909c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-versiontools \
python3.13dist-versiontools \
python313-versiontools \
python3dist-versiontools"

RDEPENDS:${PN} += "python-abi \
python313-setuptools"

inherit rpm
