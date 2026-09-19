SUMMARY = "Service identity verification for pyOpenSSL"
DESCRIPTION = "service_identity aspires to give you all the tools you need for \
verifying whether a certificate is valid for the intended purposes. \
 \
In the simplest case, this means host name verification. However, \
service_identity implements RFC 6125 fully and plans to add other \
relevant RFCs too."
LICENSE = "MIT"

PV = "26.1.0"

RPM_NAME = "python313-service_identity-26.1.0-1.2.noarch.rpm"
RPM_HASH = "23aff01537311478387f2109bf8f5560ed84f48e714274f7cfb64126303a118fbf2a4521537dbc04fb8c830bdece48afbd04b806b493d0ed1bbd4acf217e93ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-service-identity \
python3.13dist-service-identity \
python313-service-identity \
python3dist-service-identity"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-cryptography \
python313-pyasn1 \
python313-pyasn1-modules"

inherit rpm
