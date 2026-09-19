SUMMARY = "Layer Shell frontend"
DESCRIPTION = "Layer Shell frontend for pop-launcher. Currently \
the underlying protocol being used in the plugin for managing toplevels \
in wayland is defined here but it will be switched to use wlr-foreign-toplevel-management \
when it is ready."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "cosmic-launcher-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "1bd3c0ab0ee2e59f1531c76cdadad28551cb2bf16e9471618b79f70cd5a05fc5e75987b07dd93fa17a76d4421686006ce355e3623881cf5cf710e6c733bef1c5"

RPROVIDES:${PN} += "cosmic-launcher"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
