SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-audio-1.0.14-1.3.noarch.rpm"
RPM_HASH = "04611e88c0b07cafa278a8e2c23b608a520797d32f44288abe52454600ad25c1a136306034011d73d8d7c1b856bb7ce240620f433d73c85cd6d584cdb5796b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-audio"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
