SUMMARY = "Hamcrest framework for matcher objects"
DESCRIPTION = "Hamcrest framework for matcher objects. \
PyHamcrest is a framework for writing matcher objects, \
allowing you to declaratively define “match” rules."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python313-PyHamcrest-2.1.0-2.5.noarch.rpm"
RPM_HASH = "893b842ef946c332ca0f731faf38f7323b337a41b888acbd5e09c92aa9443d1ca6f77035b7a3694ca4ee9578062cc623ada1579d0d75249502c44ee715b85cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyHamcrest \
python3-hamcrest \
python3.13dist-pyhamcrest \
python313-PyHamcrest \
python313-hamcrest \
python3dist-pyhamcrest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
