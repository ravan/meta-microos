SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "5.10.12"

RPM_NAME = "python313-checkdmarc-5.10.12-1.4.noarch.rpm"
RPM_HASH = "c28394d90e2acc2ad4d7695e59ea8e0188fd3121f2b21d75146748f77889d9cef890e86d1434d2589d8bfa92cd87786a0d85a4e8031ed8cbf672a75fd3f72f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-checkdmarc \
python3.13dist-checkdmarc \
python313-checkdmarc \
python3dist-checkdmarc"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography \
python313-dnspython \
python313-expiringdict \
python313-pem \
python313-publicsuffixlist \
python313-pyOpenSSL \
python313-pyleri \
python313-requests \
python313-timeout-decorator \
python313-xmltodict"

inherit rpm
