SUMMARY = "Etrophy shared data"
DESCRIPTION = "Package containing edje file for ETrophy."
LICENSE = "BSD-2-Clause"

PV = "0.5.1"

RPM_NAME = "etrophy-data-0.5.1-8.38.noarch.rpm"
RPM_HASH = "9aba39684905d310abab15807991f26b65a6a1550fc1d45924b613f961385e12ec9dd727f74be93ec6f6cb61200a7507c59d9032883e9efd77e23babe8469312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etrophy-data"

RDEPENDS:${PN} += ""

inherit rpm
