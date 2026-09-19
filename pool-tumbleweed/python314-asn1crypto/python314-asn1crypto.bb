SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-asn1crypto-1.5.1-5.11.noarch.rpm"
RPM_HASH = "89186e6f2c1449f2d82abc6e1802987bda5b309d0f8e723fed2fa2e41b9d49840967532ddd1b0904533a93294246a34178e9d097b0fef29d9940016daf3143c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asn1crypto \
python314-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm
