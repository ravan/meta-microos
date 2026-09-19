SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-less-1.38.0-42.2.noarch.rpm"
RPM_HASH = "8523327b0048d0898fdc40cc951b4c19c9fa90e80c132acd4a0d2e70e59dd705fef10e14180b9e4d343dbc046250fe0d66333305a963ec735083d96cc500b649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm
