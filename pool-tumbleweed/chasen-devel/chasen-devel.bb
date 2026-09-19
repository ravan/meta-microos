SUMMARY = "Libraries and header files for ChaSen developers"
DESCRIPTION = "Libraries and header files for ChaSen developers."
LICENSE = "BSD-3-Clause"

PV = "2.4.5"

RPM_NAME = "chasen-devel-2.4.5-4.8.aarch64.rpm"
RPM_HASH = "6b309fe2685478f5a20a241388ce96b2f639935b9c8be1d4dd1fd1d86225ec469e321ad6227b8decdf9f201a9b070e0efcad786a143839da69f6642438a3e079"

RPROVIDES:${PN} += "chasen-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
chasen"

inherit rpm
