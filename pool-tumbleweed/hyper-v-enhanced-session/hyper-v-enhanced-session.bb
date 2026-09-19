SUMMARY = "Hyper-V Enhanced session setup for openSUSE"
DESCRIPTION = "* Completes pre-requisite setup for an openSUSE VM on Hyper-V to be able to use 'Enhanced session'. \
* Works with lightdm, NOT sddm. gdm isn't an issue and is difficult to remove from a Gnome install. \
* In PowerShell, run 'Set-VM -VMName <name of vm> -EnhancedSessionTransportType HvSocket' to enable. \
* Provides /etc/xrdp/startwm.sh.userwindowmanager-sample to use in '$HOME'."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "hyper-v-enhanced-session-1.0.1-2.12.noarch.rpm"
RPM_HASH = "45ca988999a1ca4f4b8e2527cde6af7f4e8e0d7bf2e4dff4831aa3b7b5e305d0d1748cb4661e5bb39cbf2415df2207a43cd17bf3e10bb814be73167882e14124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hyper-v-enhanced-session \
hyper-v-enhanced-session"

RDEPENDS:${PN} += "/usr/bin/sh \
hyper-v \
vncmanager \
xmessage \
xorg-x11-Xvnc-novnc \
xorgxrdp \
xrdp"

inherit rpm
