SUMMARY = "LADSPA matched plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins for emulating certain aspects of the tone of a real musical \
instrument amplifier, in real time.  It contains two plugins, matched and \
unmatched."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "ladspa-matched-1-5.9.aarch64.rpm"
RPM_HASH = "949d2253aad6994008ee0c0719854887ffcaebc423c5fd95646249af8b2f0fd34f5f460a7e724fe39fc07652f6981663359daa7cc893cc668a75e0eb06374ac4"

RPROVIDES:${PN} += "ladspa-matched \
ladspa-unmatched"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
