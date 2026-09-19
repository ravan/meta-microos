SUMMARY = "Disable audio support in PipeWire / WirePlumber"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package makes wireplumber use the video-only-profile when \
started via the wireplumber user service (the default way to run \
it) effectively disabling the use of alsa devices in PipeWire."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-video-only-profile-0.5.17-1.1.noarch.rpm"
RPM_HASH = "9fe385a3da5acd83f316aded64e03d046f2dd06f354b3e675dc20183c9555ee23d8c601cab653a68b639363504e6dbe7a71b6b574b224d08fc63bcf91bb3f79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wireplumber-video-only-profile"

RDEPENDS:${PN} += "libwireplumber-0-5-0 \
wireplumber"

inherit rpm
