SUMMARY = "Python module for Libravatar"
DESCRIPTION = "PyLibravatar is a module for using federated Libravatar \
avatar hosting service from within Python applications."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-pyLibravatar-2.0.2-1.2.noarch.rpm"
RPM_HASH = "7fe54ebb264bcd0939ffcc23557075b0c4dda598cad0766c862b8b43f5f6c4ba16a0c38ce55a25074fddde5a48dc40881f4bfc6a01c8d4511bc8471ae45abefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylibravatar \
python314-pyLibravatar \
python3dist-pylibravatar"

RDEPENDS:${PN} += "python-abi \
python314-dnspython"

inherit rpm
