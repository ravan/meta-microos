SUMMARY = "Launcher for flake applications"
DESCRIPTION = "Run flake applications using a symlink structure pointing \
to a launcher binary which actually launches the application through \
a runtime engine like podman. Along with the launcher there is \
also a control tool to register an application as a flake application"
LICENSE = "MIT"

PV = "3.1.45"

RPM_NAME = "flake-pilot-3.1.45-1.2.aarch64.rpm"
RPM_HASH = "dc423cca3b294abf557513826dfe4f4d85b8a7e0ae7d91b6b0d19e9afa3a58023f79055b2632726f37aa400f671d89e201864c9cec854fb2e5343865584c6b33"

RPROVIDES:${PN} += "config-flake-pilot \
flake-pilot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
rsync \
sudo \
tar"

inherit rpm
