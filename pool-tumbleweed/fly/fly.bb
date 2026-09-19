SUMMARY = "A Script to Create PNGs"
DESCRIPTION = "Fly allows you to create images with script statements. It uses gdlib."
LICENSE = "SUSE-Permissive"

PV = "2.0.1"

RPM_NAME = "fly-2.0.1-2.9.aarch64.rpm"
RPM_HASH = "ece0905223b08bf8b92b606cdcb61ee4949ce6b8761e0c196a1e8f27bddf63ae826a90bcb311c0d9c1621fd64085f6c299cfb1a0d734bb56953ca1d6887931a8"

RPROVIDES:${PN} += "fly"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
