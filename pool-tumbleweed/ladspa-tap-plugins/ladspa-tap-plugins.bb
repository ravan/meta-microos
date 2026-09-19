SUMMARY = "LADSPA TAP plugins"
DESCRIPTION = "This package provides a collection of LADSPA (Linux Audio Developer's \
Simple Plug-in API) TAP plugins, short for Tom's Audio Processing, \
which contains a collection of various audio plugins."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "ladspa-tap-plugins-1.0.1-2.9.aarch64.rpm"
RPM_HASH = "32c6b8871af5bd061badef3362998abe23cc46cc9831600ee2d941d848bbbe769d658231532f74d5fa66a919b3611c4c9737de881e397df50eb4b53b192fc1e4"

RPROVIDES:${PN} += "ladspa-tap-plugins"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
