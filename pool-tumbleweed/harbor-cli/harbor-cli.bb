SUMMARY = "CLI for the Harbor cloud native registry"
DESCRIPTION = "CLI for the Harbor cloud native registry"
LICENSE = "Apache-2.0"

PV = "0.0.25"

RPM_NAME = "harbor-cli-0.0.25-1.1.aarch64.rpm"
RPM_HASH = "2970462a7ffe4d3000a844e8ff83bc7fb3e3d8d86c8fdbe04ad1018a03122c7f6b0a876d8cceeb01fac482955afbb491393bc5750823b1081412462f896daa89"

RPROVIDES:${PN} += "harbor-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
