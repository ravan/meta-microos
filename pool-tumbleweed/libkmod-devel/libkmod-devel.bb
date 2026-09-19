SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "34.2"

RPM_NAME = "libkmod-devel-34.2-5.3.aarch64.rpm"
RPM_HASH = "b678f2a50d95a7efa804e5d9061f74e305d3b55f97c471d20c7d8637ef1b61c97e241cab370e8b8e85dfdc26c4c9bfd9d77f0b04467c15deebe6236cc01ac4e2"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
