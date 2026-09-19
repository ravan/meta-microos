SUMMARY = "Definition of openSUSE products for the Agama installer."
DESCRIPTION = "Definition of openSUSE products (Tumbleweed, Leap, MicroOS and Slowroll) for the Agama installer."
LICENSE = "GPL-2.0-only"

PV = "24+0.a836cced5"

RPM_NAME = "agama-products-opensuse-24+0.a836cced5-39.1.noarch.rpm"
RPM_HASH = "9df27049bf4906b68e464a087fe19052b65ae9e52e2b5da935f1bc06bee1692ddefe01b5c91849c926dc5a262c487f11faf73dec39d3a3fcf210d900f574953a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agama-products-opensuse"

RDEPENDS:${PN} += ""

inherit rpm
