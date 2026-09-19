SUMMARY = "NetCDF interface for Octave"
DESCRIPTION = "A MATLAB compatible NetCDF interface for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.20"

RPM_NAME = "octave-forge-netcdf-1.0.20-1.1.aarch64.rpm"
RPM_HASH = "48553fef3be0b8a1b8176cc40135eaa47ba185d7b7c8fda23f251e4281e9568c2a4b49a504bce29fecb76fefc53180229a9a4cbe0609f1924f02acb04d99ab19"

RPROVIDES:${PN} += "octave-forge-netcdf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnetcdf.so.22 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
