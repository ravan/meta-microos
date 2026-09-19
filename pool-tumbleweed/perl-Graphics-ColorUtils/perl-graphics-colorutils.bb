SUMMARY = "Easy-to-use color space conversions and more"
DESCRIPTION = "This modules provides some utility functions to handle colors and color \
space conversions. \
 \
The interface has been kept simple, so that most functions can be called \
'inline' when making calls to graphics libraries such as GD, Tk, or when \
generating HTML/CSS. (E.g. for GD: '$c = $img->colorAllocate( hsv2rgb( 270, \
0.5, 0.3 ) );'.) \
 \
Features: \
 \
* Color Space Conversions \
 \
  Color space conversions, in particular between the 'intuitive' color \
  spaces HSV (Hue/Saturation/Value) and HLS (Hue/Lightness/Saturation) to \
  and from RGB (Red/Green/Blue). \
 \
* Color Lookup \
 \
  Color lookup by name for three standard sets of colors: WWW/CSS, SVG, and \
  X11. \
 \
* Color Gradients \
 \
  Management of color gradients, which can be indexed by a floating point \
  number in the range 0..1. (Mostly intended for false-color data \
  visualization.)"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.17"

RPM_NAME = "perl-Graphics-ColorUtils-0.17-1.31.noarch.rpm"
RPM_HASH = "f50b88d53e09e75546696dc8238d76f755bd761c0e8d1babae40e1ef59ede6881b70576f5817ad68b327623d3a81d3047b99b6390e96898e28f4e126cb5f2a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--ColorUtils \
perl-Graphics-ColorUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
