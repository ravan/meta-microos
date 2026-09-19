SUMMARY = "The development files for libconfuse"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements. \
 \
This package holds the development files for libconfuse."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4"

RPM_NAME = "libconfuse-devel-3.4-1.1.aarch64.rpm"
RPM_HASH = "b706c74d497072d9efaa28ee3fd195b502a6ea88441bb2265ee61c7f6391bf7023f68ae857e9fc57b8ec67ceea2a3658c5fc48c9cdd4efe2c2f0116f8cb84f1f"

RPROVIDES:${PN} += "libconfuse-devel \
pkgconfig-libconfuse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfuse2"

inherit rpm
