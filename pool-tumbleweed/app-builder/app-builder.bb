SUMMARY = "Generic helper tool to build app in a distributable format"
DESCRIPTION = "Generic helper tool to build app in a distributable formats. \
Used by electron-builder but applicable not only for building Electron applications."
LICENSE = "MIT"

PV = "5.0.0~alpha.11"

RPM_NAME = "app-builder-5.0.0~alpha.11-1.11.aarch64.rpm"
RPM_HASH = "2516259665c574e376a79e34f9e3ac804cdd3b1a2c93fd03fe7fa01b35ececb5929e6327e425f50d37b8f599fb1fd9a4e1bdec11fb0acba0eba43fa8ae6ae927"

RPROVIDES:${PN} += "app-builder"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
