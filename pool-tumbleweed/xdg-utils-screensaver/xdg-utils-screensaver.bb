SUMMARY = "Command line tool for controlling the screensaver"
DESCRIPTION = "xdg-screensaver provides commands to control the screensaver. \
 \
For use inside a desktop session only. It is not recommended to \
use xdg-screensaver as root. \
 \
Separated from the main package to isolate Perl dependency."
LICENSE = "MIT"

PV = "1.2.0+20251025"

RPM_NAME = "xdg-utils-screensaver-1.2.0+20251025-1.2.noarch.rpm"
RPM_HASH = "08928fe3291da429385f1e65fed130be5a62b50c35cce834489d5905bfac90a258376337bdc55cb0c5cb1508f77bdbd7d6e04751566b4c31b6c90d2db38fdf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-utils-/usr/bin/xdg-screensaver \
xdg-utils-screensaver"

RDEPENDS:${PN} += "/usr/bin/sh \
perl \
perl-Net-DBus \
perl-X11-Protocol \
xdg-utils"

inherit rpm
