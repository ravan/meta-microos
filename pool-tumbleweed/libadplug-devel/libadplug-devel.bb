SUMMARY = "Development Files for libadplug"
DESCRIPTION = "AdPlug is a hardware independent AdLib sound player library. \
AdPlug plays sound data, originally created for the AdLib (OPL2) and \
Sound Blaster (Dual OPL2/OPL3) audio boards, directly from its original \
format on top of an emulator or by using the real hardware. \
No OPL chip is required for playback. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libadplug."
LICENSE = "LGPL-2.1-only"

PV = "2.4"

RPM_NAME = "libadplug-devel-2.4-1.7.aarch64.rpm"
RPM_HASH = "4db1326f6256d1be7f292df1e8219fbcce3ff4834ec85696bbba604ce719483581fa7f063b2a9cdbd7e372bddc709e2aa7647ac68375d22129ec56003d3e4229"

RPROVIDES:${PN} += "libadplug-devel \
pkgconfig-adplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadplug2-4-0 \
pkgconfig-libbinio"

inherit rpm
