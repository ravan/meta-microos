SUMMARY = "Platform independent system calls for Lua"
DESCRIPTION = "Adds a Lua API for making platform independent system calls."
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "luajit-luasystem-0.6.3-2.3.aarch64.rpm"
RPM_HASH = "d1113a2bccb7f38d798345830e27dc5a077b7598705d5fb239c3860604130b2f2d9685255d60751b0a9051b4248bc674d55dfe7e4d84efaf66ceb6fe50cfef8a"

RPROVIDES:${PN} += "luajit-luasystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
luajit"

inherit rpm
