SUMMARY = "YaST Installation Packages"
DESCRIPTION = "YaST tools for installing your system."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-yast2_install_wf-20260219-1.2.aarch64.rpm"
RPM_HASH = "e952f4fbfbe6a85959c289ef31b925899e1df41da70d5936db8bc276e844a639bc92b2b36e2328118e835c264daab123a99be54791d825f4b28ae363ae806318"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-yast-yast2-install-wf"

RDEPENDS:${PN} += "libyui-ncurses-pkg \
yast2-bootloader \
yast2-installation \
yast2-network \
yast2-ntp-client \
yast2-users"

inherit rpm
