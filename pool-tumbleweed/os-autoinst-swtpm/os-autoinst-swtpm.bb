SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788768889.879c500"

RPM_NAME = "os-autoinst-swtpm-5.1788768889.879c500-1.1.aarch64.rpm"
RPM_HASH = "cedd858c414751bdb67cf3c61b82ebb6a8c2de5690366ba08c907270a2969585f366b0ed9ed44cd94d5e52305eb849d4ce07a7c96cf99f384ac941041209c4c1"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
