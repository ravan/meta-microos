SUMMARY = "D-Bus service to check the availability of dual GPUs"
DESCRIPTION = "switcheroo-control is a D-Bus service to check the availability of dual GPUs."
LICENSE = "GPL-3.0-only"

PV = "3.0"

RPM_NAME = "switcheroo-control-3.0-1.6.aarch64.rpm"
RPM_HASH = "b8a0ca5790e3348d4165bbf2fbeff1bc9e1ab25096913c66bdaadecfdbf1f7e54152a7683fbef1cb9342bf0a3f599b79d77f51fa4e8c7e9b2b0ab43353740648"

RPROVIDES:${PN} += "switcheroo-control"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
systemd"

inherit rpm
