SUMMARY = "Utility to print an XKB keyboard description"
DESCRIPTION = "xkbprint generates a printable or encapsulated PostScript description \
of an XKB keyboard description."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xkbprint-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "03db8575e579d7686bd5f5ef38bf6378354c5754e05477d5424aa53b9a615e33b754437f49dee6daf4172e696049cd6279297a11699bb088dea6d0d61ba6a472"

RPROVIDES:${PN} += "xkbprint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
