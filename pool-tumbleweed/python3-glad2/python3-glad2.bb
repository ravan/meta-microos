SUMMARY = "Command line utility to load/generate multi-language GL/GLES/EGL/GLX/WGL code"
DESCRIPTION = "Glad is a command line utility to generate GL/GLES/EGL/GLX/WGL loader code \
based on the official specifications for using as bundled source code with \
apps."
LICENSE = "MIT"

PV = "2.0.8"

RPM_NAME = "python3-glad2-2.0.8-1.4.noarch.rpm"
RPM_HASH = "07883e967dcd13c51136b8adcfaace2aa9a72ec02a74bddf976d132ead0a8b7943b5e68c66f4267e8c144dea958f366c69d82a3f9f10eec371c10c802876231d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glad \
python3-glad2 \
python3.13dist-glad2 \
python3dist-glad2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Jinja2"

inherit rpm
