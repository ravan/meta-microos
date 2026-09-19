SUMMARY = "Include Files mandatory for Development"
DESCRIPTION = "This package contains include files to develop LADSPA plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-devel-1.17-1.20.noarch.rpm"
RPM_HASH = "5477cde504d2461d1634af06fd87ad500f3768b5788657cd4926e11efc7f4ed32429083b7aadf09a384b53fa97d80e294d00e122a8425b83b160d31fdf208c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ladspa-devel"

RDEPENDS:${PN} += ""

inherit rpm
