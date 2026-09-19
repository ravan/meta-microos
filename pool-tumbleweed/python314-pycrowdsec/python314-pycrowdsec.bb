SUMMARY = "Python bouncer and clients for crowdsec"
DESCRIPTION = "Python bouncer and clients for crowdsec"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python314-pycrowdsec-0.0.5-1.5.noarch.rpm"
RPM_HASH = "82814e9cec33ec225a03ac0b89e411997a8da3a043e35c60bb320538ff6665ff6697dd61d630d6e61b453b1442e7c3927d747084352e39cc32121d25ff8dd71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycrowdsec \
python314-pycrowdsec \
python3dist-pycrowdsec"

RDEPENDS:${PN} += "python-abi \
python314-importlib-metadata \
python314-requests"

inherit rpm
