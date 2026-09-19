SUMMARY = "Korean documentation for lxc"
DESCRIPTION = "Korean language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "7.0.0"

RPM_NAME = "lxc-ko-doc-7.0.0-1.3.noarch.rpm"
RPM_HASH = "a911e6c64d060f857bec9a4662978ee89d746accfcccb8a9215517b56f705c292a7fa0077f0353616b2515f99f2e07988365d2c16f29312246e2af21b481926a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ko-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
