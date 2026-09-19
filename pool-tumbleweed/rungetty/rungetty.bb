SUMMARY = "Minimal Getty for Virtual Consoles"
DESCRIPTION = "rungetty might be the getty you were looking for when you want to run any \
program, not just login. If a different program than login is used it usually \
is run as nobody:nogroup, or the user/group specified on the commandline. \
rungetty can even be configured to autologin, under certain circumstances. \
See the manual page for more information. \
 \
You have to change some lines in /etc/inittab for having any effect after \
installing the package.  rungetty is based on mingetty and therefore not \
suitable for serial use."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "rungetty-1.2-9.20.aarch64.rpm"
RPM_HASH = "9365c1ac497d4b83fd8d43ac0ba333962d2927639ec539b2d828104ba12bf7b296395693daf70489b849161c7a834e20d2d27f45e3e74dfd2221baf3f4e9a391"

RPROVIDES:${PN} += "rungetty \
sysvinit-/sbin/mingetty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
