SUMMARY = "Python library to control interactive applications"
DESCRIPTION = "Aexpect is a Python library used to control interactive applications, very \
similar to pexpect. It can be used to control applications such as ssh, scp \
sftp, telnet, among others."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "python313-aexpect-1.8.0-1.2.noarch.rpm"
RPM_HASH = "f027d44620e1243d3f78b91ae7504dd39880b5ac2c1c45ed95f08c4b2080cceb225bc6e5936515c5ad61877c08296e7d9f73a6e3d602bf4274957b2b3bff570f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aexpect \
python3.13dist-aexpect \
python313-aexpect \
python3dist-aexpect"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
