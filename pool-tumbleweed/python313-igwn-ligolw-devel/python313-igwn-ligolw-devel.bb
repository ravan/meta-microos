SUMMARY = "Headers and sources for developing with igwn_ligolw"
DESCRIPTION = "This module provides a python LIGO Light-Weight XML I/O Library \
 \
This package provides the headers and sources for developing with igwn_ligolw."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python313-igwn-ligolw-devel-2.1.0-1.5.aarch64.rpm"
RPM_HASH = "cfa55227f989f0d0a0aba76c7eaa09f79e30eee3dc859914a5e4a150933ad2a0460bb09b3efb03e0edab4bb8085364e45b75a53ea240e638ed7ee1b5fb814144"

RPROVIDES:${PN} += "python3-igwn-ligolw-devel \
python313-igwn-ligolw-devel"

RDEPENDS:${PN} += "python313-igwn-ligolw"

inherit rpm
