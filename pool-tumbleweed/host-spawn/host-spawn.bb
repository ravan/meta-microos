SUMMARY = "A reimplementation of flatpak-spawn --host"
DESCRIPTION = "Run commands on your host machine from inside your flatpak sandbox, toolbox or distrobox containers."
LICENSE = "MIT-0"

PV = "1.6.1"

RPM_NAME = "host-spawn-1.6.1-1.10.aarch64.rpm"
RPM_HASH = "29bdc2d9d79208f45d915ab5a8d22c1d8e02930719f31cd8b6ed84def9f7ad39a34c502e721943c4a84129c1c6ed97135c8b10b60a4ac6d78af1b03ba28fc85f"

RPROVIDES:${PN} += "host-spawn"

RDEPENDS:${PN} += ""

inherit rpm
