SUMMARY = "Avocado Test Framework"
DESCRIPTION = "Avocado is a set of tools and libraries (what people call these days a \
framework) to perform automated testing."
LICENSE = "GPL-2.0-only"

PV = "113.0"

RPM_NAME = "python3-avocado-113.0-1.2.noarch.rpm"
RPM_HASH = "3296490077e1c93c9ccfbec2ad9342223cf751ff6fc506cb6efd03b5bf7531fb4d88b0c6453379d99eaf3e3cffe3d1f13e7a1b246d58d0df066c71d324439453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avocado \
python3-avocado \
python3.13dist-avocado-framework \
python3dist-avocado-framework"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
avocado-common \
gdb \
procps \
python-abi \
python3-requests \
python3-setuptools \
update-alternatives"

inherit rpm
