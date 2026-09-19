SUMMARY = "LADSPA super-60 plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugin for 16th order IIR Filter modeled after an impulse response from \
a Fender 'Super 60' guitar amplifier."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "ladspa-super-60-1-4.9.aarch64.rpm"
RPM_HASH = "676ed53ad6a08f0322ed8d68cfbda52c4ec28202ee97dce3fb0de256c192db383fe6a292786ecb08b7f0cb6a9f0feeeef70d3868bb61aa704d067b89d141fdb0"

RPROVIDES:${PN} += "ladspa-super-60"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
