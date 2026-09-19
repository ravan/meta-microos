SUMMARY = "Examples and Documents for asciidoc"
DESCRIPTION = "This package contains examples and documents of asciidoc."
LICENSE = "GPL-2.0-or-later"

PV = "10.2.1"

RPM_NAME = "asciidoc-examples-10.2.1-2.1.noarch.rpm"
RPM_HASH = "c16d428cc54f2406d4657fe49f03b1ef9e63caa63d083f846c1e97bb0d0b0be666dd3ab658299278191ab5b455452cfb6aa01efdd12e493a009faea83d36e83a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-examples"

RDEPENDS:${PN} += ""

inherit rpm
