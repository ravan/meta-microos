SUMMARY = "Shared library for fastjet-contrib"
DESCRIPTION = "This package provides the shared library for fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.054"

RPM_NAME = "libfastjetcontribfragile-1.054-1.8.aarch64.rpm"
RPM_HASH = "611e786888e27576394b0f8d28502640ca3844f3aa0e619376661a7475c2b8f71950188db95e1548e2ae29a73ec3aacbae94444dad107a77d370201a6a8cb470"

RPROVIDES:${PN} += "libfastjetcontribfragile \
libfastjetcontribfragile.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
