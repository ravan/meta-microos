SUMMARY = "Custom CTL scripts for the ART raw processor."
DESCRIPTION = "This package provides the following scripts for ART: \
  * colormix.ctl: mixes a user-selected RGB color with the image, using various blending modes \
  * density.ctl: increase saturation while also lowering luminance, emulating 'film density' filters available for some video editors \
  * gamutcompress.ctl: gamut compression using the ACES method \
  * hueeq.ctl: adjust the hue, saturation or luminance of each pixel according to its hue \
  * lumeq.ctl: adjust the hue, saturation or luminance of each pixel according to its luminance \
  * odt.ctl: ART's take on tone mapping from scene to display \
  * posterize.ctl: simulates a posterization effect given by reducing the bit depth of the image \
  * sateq.ctl: adjust the hue, saturation or luminance of each pixel according to its saturation \
  * submix.ctl: mixes a user-selected RGB color with the image in a subtractive manner (i.e. as if the two colors were mixed like paint colors) \
  * tetrahsl.ctl: color warping by means of tetrahedral division of the RGB color cube, using a HSL interface \
  * tetrargb.ctl: tetrahedral color warping using the original RGB interface \
  * tinteq.ctl: add a color cast to each pixel according to its luminance \
  * wbchmix.ctl: white balance and RGB primaries correction"
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "art-ctlscripts-1.2-1.3.noarch.rpm"
RPM_HASH = "d5142d0fb8f827c1d4bffb15c6788d520016df2114a8acced81a2d1ce4a28b06ec440c588eabe82a9b36c120002df745eaeec261609261aa2ba93a879e88a9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "art-ctlscripts"

RDEPENDS:${PN} += "ART"

inherit rpm
