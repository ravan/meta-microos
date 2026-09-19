SUMMARY = "Arcade-style 2D firefighting action"
DESCRIPTION = "Mr. Rescue is an arcade styled 2d action game centered \
around evacuating civilians from burning buildings. \
 \
The game features fast paced fire extinguishing action, \
intense boss battles, a catchy soundtrack and lots of \
throwing people around in pseudo-randomly generated \
buildings."
LICENSE = "Zlib & MIT & CC-BY-SA-3.0"

PV = "1.02e"

RPM_NAME = "mrrescue-1.02e-6.8.noarch.rpm"
RPM_HASH = "2788d73a847c35fa546878e3500914f7c9d76a7ba1309de429fc6d9439ce355f13cdd02aba207fad2ce2628e6b385f9dd90298bb78def00b5e7ac649f211c202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mrrescue"

RDEPENDS:${PN} += "/usr/bin/sh \
love \
update-desktop-files"

inherit rpm
