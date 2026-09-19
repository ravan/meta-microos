SUMMARY = "LADSPA sooperlooper plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
vocoder plugin."
LICENSE = "GPL-2.0+"

PV = "0.93"

RPM_NAME = "ladspa-sooperlooper-0.93-4.9.aarch64.rpm"
RPM_HASH = "c93da68afc1a1fa63be7a42453b272a0be674e256acfc88eb658954fa6cf880eb9e1cc9e2b9239617892450bf6f028f9f65425faffc9f6cc802dbaddac55106e"

RPROVIDES:${PN} += "ladspa-sooperlooper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
