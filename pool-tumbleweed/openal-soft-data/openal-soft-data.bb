SUMMARY = "OpenAL Soft auxiliary data and config"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of the OpenGL API. \
This package contains auxiliary data and config files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.3~179"

RPM_NAME = "openal-soft-data-1.24.3~179-1.6.noarch.rpm"
RPM_HASH = "18c51b9a193dbfc4888f1905095ac19614b0bdfb2210cfc778fec66411c00a2e0be0119c8f389dde9dfb94260d078971a21f38639c2de9363787673e7f024a94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-openal-soft-data \
openal-soft \
openal-soft-data"

RDEPENDS:${PN} += ""

inherit rpm
