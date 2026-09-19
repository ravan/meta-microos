SUMMARY = "Development files for the Input Device Library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require libinput."
LICENSE = "MIT"

PV = "1.31.3"

RPM_NAME = "libinput-devel-1.31.3-1.3.aarch64.rpm"
RPM_HASH = "a132bcc644e0f5bc5ad2e89d9b04ddcffc15e6db7bfed99f6ed965a5bfa5a4e5ac1291f06dace8c0d1feb410811f47f88587b57dd13eb757bb155048f706810b"

RPROVIDES:${PN} += "libinput-devel \
pkgconfig-libinput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinput10 \
pkgconfig-libudev"

inherit rpm
