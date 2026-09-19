SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-dvd-20260915-3446.1.aarch64.rpm"
RPM_HASH = "ab7fe1d6840678162a446569a744be8a9b15f1ae05d182902b1c62c2e6b36d87f4897a62f90c27e47db285d5ba92c42919535ad7571558057ff024c2ebffbd38"

RPROVIDES:${PN} += "flavor-dvd \
openSUSE-release-dvd \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
