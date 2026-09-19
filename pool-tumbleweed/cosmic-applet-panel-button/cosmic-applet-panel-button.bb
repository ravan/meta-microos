SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-panel-button-1.0.14-1.3.aarch64.rpm"
RPM_HASH = "eae7b01b12aa0254d80af5bd5cc3d6500f0c52f248c654e9d9773e15505fae0359ab82e41e0214eb5eccff5c1872fbc64c1a1adc06c6b6d70bb747ee30714719"

RPROVIDES:${PN} += "cosmic-applet-panel-button"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
