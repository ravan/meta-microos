SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python314-python-openid-cla-1.2-2.5.noarch.rpm"
RPM_HASH = "b05be0f00fb1c0c560df6ebf7e2f671984f3ab3f023d8cd7d2ae211ea416e561ae26190a4d0670daeafa6c6b7d81b2e42c7ebf45d845287aa77c06ff81073467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-openid-cla \
python314-python-openid-cla \
python3dist-python-openid-cla"

RDEPENDS:${PN} += "python-abi \
python314-python3-openid"

inherit rpm
