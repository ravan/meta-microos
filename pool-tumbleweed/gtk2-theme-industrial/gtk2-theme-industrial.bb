SUMMARY = "Industrial Theme for GTK+ 2"
DESCRIPTION = "This package provides the Industrial GTK+ 2 theme."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-industrial-2.20.2-23.6.noarch.rpm"
RPM_HASH = "a9cd09f016f0f58c8a93a4d72e12a6c3589e1af2469b5ef940af24212770b75d9b86208d1b8c7149c171cd2c0883e9aa64d00178dad6978dda4e6ea598668cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-industrial"

RDEPENDS:${PN} += "gtk2-engine-industrial"

inherit rpm
