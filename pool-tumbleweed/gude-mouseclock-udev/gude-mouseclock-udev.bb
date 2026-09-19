SUMMARY = "Udev rules for GUDE DCF77 receivers"
DESCRIPTION = "Udev rules for GUDE DCF77 receivers. \
 \
* creates the symlink for /dev/refclock-0 to the TTY your DCF receiver \
  is connected to. \
* set group permission to 'ntp' for your DCF receiver's TTY to give \
  ntpd access to your device. \
 \
Supported devices \
 * GUDE Expert mouseCLOCK USB II \
 \
NOTE: You still have to manually adjust ntpd's AppArmor profile to give ntpd \
access to your DCF receiver's serial port (/etc/apparmor.d/tunables/ntpd)"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "gude-mouseclock-udev-0.1-1.16.noarch.rpm"
RPM_HASH = "eecae22ae4e6c4b4ab3e48e98f35ca931fd4f1982916d1ca2dc231717cf275a5e9e04e9c0a2fb874443e1d10301b6a5a7db3795d01637b3d7a91f1caacf81a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gude-mouseclock-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd \
user-ntp"

inherit rpm
