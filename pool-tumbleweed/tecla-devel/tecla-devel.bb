SUMMARY = "Development files for tecla, an interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "tecla-devel-1.6.3-4.9.aarch64.rpm"
RPM_HASH = "c4c3dde1f20877d5cb6ecf608ab23a755fe5ea58a82856b3ab21c31401977313e52a5241822dc29071ee325e70fb68c38f2ace30380a8508e35df144bf8c5560"

RPROVIDES:${PN} += "tecla-devel"

RDEPENDS:${PN} += "libtecla-r1"

inherit rpm
