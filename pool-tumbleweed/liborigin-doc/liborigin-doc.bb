SUMMARY = "Documentation for liborigin"
DESCRIPTION = "This package provides the documentation for liborigin."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.3"

RPM_NAME = "liborigin-doc-3.0.3-1.5.noarch.rpm"
RPM_HASH = "98e98d611f7d824c1440b71c4a05ff734671e34ae455db669ab6522dd93f63becf4d119e38fcf6d0db80faae908028d319e044d3f1344eb838d85fdcad796578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liborigin-doc"

RDEPENDS:${PN} += ""

inherit rpm
