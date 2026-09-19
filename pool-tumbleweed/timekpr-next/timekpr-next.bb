SUMMARY = "Keep control of computer usage"
DESCRIPTION = "Timekpr-nExT is a program that tracks and controls the computer usage \
of your user accounts. You can limit their daily usage based on a \
timed access duration and configure periods of day when they can or \
cannot log in. \
. \
This may be used for parental control to limit the amount of screen time \
a child spends in front of the computer."
LICENSE = "GPL-3.0-only"

PV = "0.5.8"

RPM_NAME = "timekpr-next-0.5.8-1.4.noarch.rpm"
RPM_HASH = "4c335c5c68cd6b6333f7436a6f6951170d4f9c6f60968181872d24c3e495df1558b3333e9e4bf6150104cf3855aeb62f10c1c0ab6578d3b6bd491b9969de2dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-timekpr-next \
timekpr-next"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-dbus-python \
python3-psutil \
system-group-timekpr \
systemd \
typelib-1-0-AppIndicator3-0-1"

inherit rpm
