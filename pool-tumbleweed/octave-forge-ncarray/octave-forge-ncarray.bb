SUMMARY = "Access to NetCDF files as a multi-dimensional array from Octave"
DESCRIPTION = "Access a single or a collection of NetCDF files as a multi-dimensional array. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "octave-forge-ncarray-1.0.6-2.6.noarch.rpm"
RPM_HASH = "f9329265fe8726b570876cbc4193beb86296ddc5dedaf4eaf7a3fa7de3ed2a054ff26bef6be1ddeaa1fa4eeccdfcb34d3b64a4d19509198e1cb3ed6891bfb05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-ncarray"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-netcdf \
octave-forge-statistics"

inherit rpm
