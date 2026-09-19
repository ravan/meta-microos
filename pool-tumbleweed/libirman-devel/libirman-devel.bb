SUMMARY = "Development files for libirman"
DESCRIPTION = "libirman is a general purpose library for programs to use in order to \
receive infrared signals via irman-compatible hardware. \
 \
Devel files for libirman from the lirc project."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "libirman-devel-0.5.2-6.3.aarch64.rpm"
RPM_HASH = "96a4399c442ab7bdafe9a20d94b6918826da9fafa95b174465165c191b3529b54d4ee51ad18b7e566b157a5b9afa44049214e885e5a891a3403a3f83da8e0eed"

RPROVIDES:${PN} += "libirman-devel \
pkgconfig-libirman"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libirman0"

inherit rpm
