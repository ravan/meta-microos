SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-minimize-1.0.14-1.3.noarch.rpm"
RPM_HASH = "290f8f0a6bce74b52ea22c2bde496e3be165087e26c0b3c02d894b7302420fafb644d2b24ad157f0586586d23a42f32554fb58b3563e7b10346e8b6202c681f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-minimize"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
