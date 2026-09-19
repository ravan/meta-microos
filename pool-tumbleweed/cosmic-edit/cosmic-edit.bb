SUMMARY = "COSMIC Text Editor"
DESCRIPTION = "Text editor for the COSMIC desktop"
LICENSE = "GPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "cosmic-edit-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "23454ca35f56ad70221cd5750f2e1740be4d2b899794a029a989cae311d37ff215f0a4f7f2e4db734827665a58df881b29f5376e2ec897ea130a5489a08668b7"

RPROVIDES:${PN} += "cosmic-edit"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
