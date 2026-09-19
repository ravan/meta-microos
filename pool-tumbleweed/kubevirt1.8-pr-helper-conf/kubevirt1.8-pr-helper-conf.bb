SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-pr-helper-conf-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "8697e446c8ef882bd21d384b5cc599c817160fc451e91d100194b6d4a04cb061695e7668def432f6ea5d4d696ac2daad6ab9475e3f17d0855d635a41538ee3b2"

RPROVIDES:${PN} += "kubevirt-1.8-pr-helper-conf \
kubevirt-pr-helper-conf \
kubevirt1.8-pr-helper-conf"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
