SUMMARY = "Tool to switch between crypto policies"
DESCRIPTION = "This package provides a tool update-crypto-policies, which applies \
the policies provided by the crypto-policies package. These can be \
either the pre-built policies from the base package or custom policies \
defined in simple policy definition files. \
 \
The package also provides a tool fips-mode-setup, which can be used \
to enable or disable the system FIPS mode."
LICENSE = "LGPL-2.1-or-later"

PV = "20250714.cd6043a"

RPM_NAME = "crypto-policies-scripts-20250714.cd6043a-5.2.noarch.rpm"
RPM_HASH = "0382702a3e329ca511549e92288d810299923139aeab41f7ed1e1bc4a1438bb3afe5d2f0cab65f589b484da768b16e2fefd1692d180154fbc2d69bace0c54e3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crypto-policies-scripts \
fips-mode-setup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
crypto-policies"

inherit rpm
