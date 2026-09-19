SUMMARY = "Generic configuration for tik"
DESCRIPTION = "Generic configuration for tik. To be used for 'distribution neutral' installation media or debug/experimentation."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "tik-config-generic-1.5.1-3.1.noarch.rpm"
RPM_HASH = "e7401424fd1bf7d2b30d678dd4d731bdf88016350b6b9c632317758a4518469cf2d574627d3dab79029fcbf4cbbd849a82e65ab54e962cc27596e517648e05e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tik-config-generic \
tik-config \
tik-config-generic"

RDEPENDS:${PN} += "tik"

inherit rpm
