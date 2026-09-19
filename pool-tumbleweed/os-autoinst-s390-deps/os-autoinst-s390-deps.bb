SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788768889.879c500"

RPM_NAME = "os-autoinst-s390-deps-5.1788768889.879c500-1.1.aarch64.rpm"
RPM_HASH = "c2c10f22fc706f9f7571277a81d6ae32ae3627a0a47f90b75412ca30ed98322619088aea97eb3a6334779cd15a412626bb4a8062d90cb297e98786f214286f01"

RPROVIDES:${PN} += "os-autoinst-s390-deps"

RDEPENDS:${PN} += "/usr/bin/Xvnc \
/usr/bin/xkbcomp \
fonts-config \
icewm \
mkfontdir \
mkfontscale \
openssh-clients \
os-autoinst \
x3270 \
xdotool \
xterm \
xterm-console"

inherit rpm
