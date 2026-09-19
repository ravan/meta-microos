SUMMARY = "ICC compatible color management system"
DESCRIPTION = "The Argyll color management system supports accurate ICC profile creation for \
scanners, CMYK printers, film recorders and calibration and profiling of \
displays. \
 \
Spectral sample data is supported, allowing a selection of illuminants observer \
types, and paper fluorescent whitener additive compensation. Profiles can also \
incorporate source specific gamut mappings for perceptual and saturation \
intents. Gamut mapping and profile linking uses the CIECAM02 appearance model, \
a unique gamut mapping algorithm, and a wide selection of rendering intents. It \
also includes code for the fastest portable 8 bit raster color conversion \
engine available anywhere, as well as support for fast, fully accurate 16 bit \
conversion. Device color gamuts can also be viewed and compared using a VRML \
viewer."
LICENSE = "AGPL-3.0-only & GPL-2.0-or-later & MIT"

PV = "3.4.1"

RPM_NAME = "argyllcms-3.4.1-1.7.aarch64.rpm"
RPM_HASH = "fc5d56e323b893c94e6160b5f99605f70f0dfc8f10302bd93a7682c661eedb7286fcd35f5555579f5a401ae0a38c96f61c356f10d7031841c9fd76e3a9a64fcd"

RPROVIDES:${PN} += "argyllcms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libtiff.so.6 \
udev"

inherit rpm
