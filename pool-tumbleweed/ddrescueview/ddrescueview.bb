SUMMARY = "Graphical viewer for GNU ddrescue mapfiles"
DESCRIPTION = "This small tool allows the user to graphically examine ddrescue's map files in a user friendly GUI application. The Main window displays a block grid with each block's color representing the block types it contains. Many people know this type of view from defragmentation programs."
LICENSE = "GPL-3.0-only"

PV = "0.4.5"

RPM_NAME = "ddrescueview-0.4.5-3.15.aarch64.rpm"
RPM_HASH = "240cbb9957c7812a1d028d760d0ad1b7f8c1df915f856c29e24853bc2e8feedd8a5ddfd7a65cca6186d48ff817893009dc87aa192218815b64f5b4934039e88f"

RPROVIDES:${PN} += "ddrescueview"

RDEPENDS:${PN} += "libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
