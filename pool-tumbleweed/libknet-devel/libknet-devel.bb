SUMMARY = "Development files fro the Kronosnet core switching implementation"
DESCRIPTION = "The whole kronosnet core is implemented in this library. \
Please refer to the not-yet-existing documentation for further \
information."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet-devel-1.33-2.2.aarch64.rpm"
RPM_HASH = "236857d296eaa06050882c063ec637f20a8bda4e81eb19e671557e4f7768f9ad5b687e832a18cee545732c6e49541993f224c81c462f302b4a408370d4df9209"

RPROVIDES:${PN} += "libknet-devel \
libknet1-devel \
pkgconfig-libknet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libknet1 \
pkgconfig"

inherit rpm
