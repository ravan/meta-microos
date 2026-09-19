SUMMARY = "LADSPA vocoder plugin"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
vocoder plugin."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "ladspa-vocoder-0.4-2.7.aarch64.rpm"
RPM_HASH = "f3c55e5e32c2b95120ace289438c0c243eca74c6e3bd139d995b8bf774e701311d5a715079b46627edff73301860aac48c00ffa045203648677781324ac8d84e"

RPROVIDES:${PN} += "ladspa-vocoder"

RDEPENDS:${PN} += "libm.so.6"

inherit rpm
