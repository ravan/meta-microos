SUMMARY = "Documentation for birb"
DESCRIPTION = "Documentation for birb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "birb-doc-0.9.0-1.1.noarch.rpm"
RPM_HASH = "663983d8bfa4944c79e0eb0fc223caba61d93235664d6bd1f0951c3960b6b71c37a08db630e1b25d1d8717ae2195a6b92d65e99fd659bcaf14762d1ed20e3439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "birb-doc"

RDEPENDS:${PN} += ""

inherit rpm
