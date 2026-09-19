SUMMARY = "LADSPA VCF plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins for audio EQ biquad filters."
LICENSE = "GPL-2.0"

PV = "0.0.5"

RPM_NAME = "ladspa-vcf-0.0.5-5.9.aarch64.rpm"
RPM_HASH = "ee165b0b77a83e761539179a5628b5542e244ebf17d4524408bd43cc4be3d11bd93c6396fe69aab92698e1b0caacf40b29b47c8ff5fa6ffda6d98b7fc5c16bbf"

RPROVIDES:${PN} += "ladspa-vcf"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
