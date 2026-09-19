SUMMARY = "Development files for liboggplay"
DESCRIPTION = "OggPlay is a library designed to allow drop-in playback of Xiph.Org media in an \
application. \
 \
This package contains the files needed to build with liboggplay."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "liboggplay-devel-0.3.0-1.6.aarch64.rpm"
RPM_HASH = "532e4d39d1a863bfff58182e2c98a1cae2c8ef6b319a5f3861540c1bd85f079980b689765d1af2ab9201e0d8abb3a4520d4166d91bbfc66253aca07e3c30422b"

RPROVIDES:${PN} += "liboggplay-devel \
pkgconfig-oggplay \
pkgconfig-oggplay-uninstalled"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboggplay2 \
pkgconfig-fishsound \
pkgconfig-oggz \
pkgconfig-theora"

inherit rpm
