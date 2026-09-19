SUMMARY = "Analog / digital clock for X"
DESCRIPTION = "xclock is the classic X Window System clock utility. It displays \
the time in analog or digital form, continuously updated at a \
frequency which may be specified by the user."
LICENSE = "X11"

PV = "1.2.1"

RPM_NAME = "xclock-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "85aebc367a3006e712cb2e9d98942a0864bf6d0911025f8750f45980401bac2a829abdc621511caf346194bfab9349c210f8b00affadfa877408bd8e63598b95"

RPROVIDES:${PN} += "xclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
