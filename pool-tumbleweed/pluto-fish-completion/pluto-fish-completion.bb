SUMMARY = "Fish Completion for pluto"
DESCRIPTION = "Fish command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.24.3"

RPM_NAME = "pluto-fish-completion-5.24.3-1.1.noarch.rpm"
RPM_HASH = "3f5e72d18647db8ee4927619d1ec54c46e64f7032920878ad4625e3b1dc0500a07283cf5f7b7784c7fe2d3b9a28c31fffc08ea2af0015f116163cb68fbf105ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-fish-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
