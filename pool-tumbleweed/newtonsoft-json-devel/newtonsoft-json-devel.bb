SUMMARY = "Development files for JSON.net"
DESCRIPTION = "Newtonsoft.Json aka Json.NET is a JSON framework."
LICENSE = "MIT & BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "newtonsoft-json-devel-7.0.1-4.6.noarch.rpm"
RPM_HASH = "5ac0eaa654701dbfc9d1bd58b299d2d487089ab8848e59dbaa6af011e90ec5092a858e9519072cfe23d8401eac3e82935396c4983c36223cdd2a7ff23eb40a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newtonsoft-json-devel \
pkgconfig-newtonsoft-json"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
newtonsoft-json"

inherit rpm
