SUMMARY = "Data Files for garcon"
DESCRIPTION = "This package provides data files for garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-data-4.20.0-1.8.noarch.rpm"
RPM_HASH = "da45171d6614e2011706f6f7ffe4ef5d2615f35d05287a855de28288fc2249388164157d260b036593fe4a997cb06af18ec1adabc953f14b3777cefe8b537e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-data"

RDEPENDS:${PN} += "libgarcon-branding"

inherit rpm
