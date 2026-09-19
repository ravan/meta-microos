SUMMARY = "Compute Library sample data"
DESCRIPTION = "Free *.npy and *.ppm files to use with example binaries."
LICENSE = "MIT"

PV = "53.2.0"

RPM_NAME = "ComputeLibrary-sample-data-53.2.0-1.1.aarch64.rpm"
RPM_HASH = "15274194addc690ca926c99a774f482c30f43140707108f0c3f039d04493b74be1b7e2c7166ef56def82ab5155bc09f14976a528b6aba3be0e7fca190cf39515"

RPROVIDES:${PN} += "ComputeLibrary-sample-data"

RDEPENDS:${PN} += ""

inherit rpm
