SUMMARY = "OpenSCAP plugin for scanning containers"
DESCRIPTION = "This package contains plugins for scanning containers using OpenSCAP either via \
podman or docker."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "openscap-containers-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "357a4c8ff41b9111bc2df874a51c4dad117944feab5e63169b3d113297375ddfa0ad8b00d9a2cb44a12b21e5a2a196aaa357c044bb8f1958c4d98b069c8e6176"

RPROVIDES:${PN} += "openscap-containers \
openscap-docker"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
python-abi"

inherit rpm
