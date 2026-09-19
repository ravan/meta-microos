SUMMARY = "Default desktop theme for the Kalpa Desktop"
DESCRIPTION = "Default plasma desktop theme for the Kalpa Desktop"
LICENSE = "GPL-2.0 & MIT & CC-BY-SA-4.0"

PV = "1.0"

RPM_NAME = "kalpa-themes-1.0-1.2.noarch.rpm"
RPM_HASH = "8ab93e48fdd8f78235b6c9072dc626be9f0e6d77cf8f5e6afacf15d565c22ac78ab9c91777bea50d3d764fee1ccf8d1d09934740ba5e33e3f3a99370560a371c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalpa-themes"

RDEPENDS:${PN} += ""

inherit rpm
