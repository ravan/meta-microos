SUMMARY = "Logos for openSUSE Distros"
DESCRIPTION = "Logos for openSUSE Distributions"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-20250203-2.2.noarch.rpm"
RPM_HASH = "520db6520f633f9c5df398d2b59b46f8b20075d1a3b66d34b7f580838714f642111055292080406499ffd2d40328aafc4fac37720e4f2bbd48c0ac998c25a6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
