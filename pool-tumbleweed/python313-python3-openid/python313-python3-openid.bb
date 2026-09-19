SUMMARY = "OpenID support for Python"
DESCRIPTION = "This is a set of Python packages to support the use of \
the OpenID decentralized identity system in applications. \
Includes example code and support for a variety of storage back-ends."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python313-python3-openid-3.2.0-4.5.noarch.rpm"
RPM_HASH = "d946db9785048929f0dc0f5d8a2e46d8ba1099972e845dca474460371661f591bbe4ea8fc055a7395499c6e48b6630281b972076e437e1e462bc5f2e1c157c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python3-openid \
python3.13dist-python3-openid \
python313-python3-openid \
python3dist-python3-openid"

RDEPENDS:${PN} += "python-abi \
python313-defusedxml"

inherit rpm
