SUMMARY = "Titlesequences for openRCT2"
DESCRIPTION = "This package contains tilesequences like the original ones \
used in RollerCoaster Tycoon 1 and 2. \
When using RCT1 sequences, the original RCT1 files have to be installed."
LICENSE = "CC-BY-4.0"

PV = "0.4.26"

RPM_NAME = "openrct2-titlesequences-0.4.26-27.1.noarch.rpm"
RPM_HASH = "e7256eb6e0b1287333c68d372b7a9b24d393e93b6bb14db61ef131f1a33c5a0d3dff112c9c0c2e154cc911d00cbfddedb2ad1c296732434d7e51a79ecabf8d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-titlesequences"

RDEPENDS:${PN} += "openrct2"

inherit rpm
