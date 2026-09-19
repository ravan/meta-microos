SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python314-python3-openid-3.2.0-4.5.noarch.rpm"
RPM_HASH = "d400eaaf58af15fa953b1de17ba52c2d7e0f0760b47adccad412e261a6dbdc90f17e8343ad58ab294224d7b153da4cd65fb8b9946c758ecd7d5a4fbb1204e629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python3-openid \
python314-python3-openid \
python3dist-python3-openid"

RDEPENDS:${PN} += "python-abi \
python314-defusedxml"

inherit rpm
