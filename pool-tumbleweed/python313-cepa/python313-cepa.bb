SUMMARY = "Python controller library for Tor"
DESCRIPTION = "Cepa is a fork of stem that adds support for v3 onion client authentication. \
 \
Stem is a Python controller library for Tor. \
With it you can use Tor's control protocol to script against the Tor process, or build things such as Nyx."
LICENSE = "LGPL-3.0-only"

PV = "1.8.4"

RPM_NAME = "python313-cepa-1.8.4-5.2.noarch.rpm"
RPM_HASH = "5dde6ec6a072d52d1b78781f88efc24c5e5012e4c5e6a032450e057f9b170d7fde45780cd9454354cebb2328e78bc80b4fbf538f13d1d366fb8b2e41c219d8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cepa \
python3-stem \
python3.13dist-cepa \
python313-cepa \
python313-stem \
python3dist-cepa"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
