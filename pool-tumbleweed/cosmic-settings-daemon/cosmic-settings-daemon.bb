SUMMARY = "COSMIC Settings daemon"
DESCRIPTION = "COSMIC Settings daemon."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-settings-daemon-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "1628830498bd2c674d7d299a10d53cdf735e66e8b7a0ff7357932b4200fce6eed5d0a50617d193e193512c0dc83094c2bce5f0eac2a788dffe0c3c66b64aa482"

RPROVIDES:${PN} += "cosmic-settings-daemon"

RDEPENDS:${PN} += "acpid \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libudev.so.1 \
libxkbcommon.so.0"

inherit rpm
