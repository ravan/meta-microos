SUMMARY = "ASN.1 parser and serializer for Python"
DESCRIPTION = "ASN.1 parser and serializer with definitions for private keys, \
public keys, certificates, CRL, OCSP, CMS, PKCS#3, PKCS#7, \
PKCS#8, PKCS#12, PKCS#5, X509 and TSP"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-asn1crypto-1.5.1-5.11.noarch.rpm"
RPM_HASH = "a30cb87ee971bcfe1b8ed9c4ceab41e83302b9cdc39e37bd7d933b1a0bba08b698e9e322d6e30f94cd6f14b79966bc88d32faf89511b0fb6f94817b301fc0178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asn1crypto \
python3.13dist-asn1crypto \
python313-asn1crypto \
python3dist-asn1crypto"

RDEPENDS:${PN} += "python-abi"

inherit rpm
