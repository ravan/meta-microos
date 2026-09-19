SUMMARY = "Documentation for the Osmocom SDR DSP primitives"
DESCRIPTION = "libosmo-dsp is a C language library for common DSP (Digital \
Signal Processing) primitives for SDR (Software Defined Radio). \
This subpackage contains the API documentation."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "libosmo-dsp-doc-0.5.0-2.3.noarch.rpm"
RPM_HASH = "d70a1a0b9e580d49f20901aa5bfc783e68a912c4f81bb734ad8b48e9a0bae1b0157f1f6d30945441b349ec6069b27278631b3fc00d93167aa369870291bdaabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosmo-dsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
