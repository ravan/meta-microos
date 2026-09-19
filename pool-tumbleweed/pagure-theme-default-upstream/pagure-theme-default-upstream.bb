SUMMARY = "Configuration for pagure to default to the upstream web interface theme"
DESCRIPTION = "This package sets the default web interface assets used for \
a Pagure server running as shipped by upstream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-default-upstream-5.14.1-3.3.noarch.rpm"
RPM_HASH = "995bcb986d5adc58a066242e20246e68e3444e478f5f3417744368252ed898e6b6b4ae4190c553926c2df29383852ac8f7ae19a953e5892ed735f9931a183a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-default \
pagure-theme-default-upstream"

RDEPENDS:${PN} += "pagure-theme-upstream"

inherit rpm
