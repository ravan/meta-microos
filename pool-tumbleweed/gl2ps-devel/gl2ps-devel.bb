SUMMARY = "Development files for GL2PS"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using GL2PS."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "gl2ps-devel-1.4.2-1.24.aarch64.rpm"
RPM_HASH = "e9eb114bf4fb5cad951ec9efbfbc3326a4872346437e3687f40aac310ccfe8f1abf8d79bd4b0ae09b0a09da9efce374a6d417222da260228915b6d11e1b71951"

RPROVIDES:${PN} += "gl2ps-devel"

RDEPENDS:${PN} += "libgl2ps1"

inherit rpm
