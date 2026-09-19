SUMMARY = "Logos for openSUSE Kubic"
DESCRIPTION = "Logos for openSUSE Kubic"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-Kubic-20250203-2.2.noarch.rpm"
RPM_HASH = "5e7558d1d1c577041038d742f39eeaf40a4c7cd0b58718e0dc027342d26cf956398c9446c083700e3f95ff9d45f8af68a1bcbc06128ff1a414539ef3d08e6b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Kubic"

RDEPENDS:${PN} += ""

inherit rpm
