SUMMARY = "Development files for nanosvg"
DESCRIPTION = "NanoSVG is a simple SVG parser. \
The output of the parser is a list of cubic bezier shapes. \
 \
The shapes in the SVG images are transformed by the viewBox \
and converted to specified units. That is, you should get \
the same looking data as your designed in your favorite app. \
 \
NanoSVG can return the paths in few different units. For \
example if you want to render an image, you may choose to \
get the paths in pixels, or if you are feeding the data into \
a CNC-cutter, you may want to use millimeters. \
 \
The units passed to NanoSVG should be one of: \
'px', 'pt', 'pc' 'mm', 'cm', or 'in'. \
DPI (dots-per-inch) controls how the unit conversion is done. \
 \
The library can be used by copying the .h files into the \
consuming package or through shared libraries installed by \
the CMake build process."
LICENSE = "Zlib"

PV = "2022.12.22"

RPM_NAME = "nanosvg-devel-2022.12.22-1.12.aarch64.rpm"
RPM_HASH = "dd5db97b4109284006150673bb5bf8f7572184e8c7be8a7d581c2252fbaaf39a0f6f6a51bb00ab771f0774f6ece2c954db624ffdc786e302c3216c2d9a1ec296"

RPROVIDES:${PN} += "cmake-NanoSVG \
nanosvg-devel"

RDEPENDS:${PN} += "libnanosvg0 \
libnanosvgrast0"

inherit rpm
