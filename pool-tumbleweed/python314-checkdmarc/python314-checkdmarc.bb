SUMMARY = "A Python module and command line parser for SPF and DMARC records"
DESCRIPTION = "A Python module and command line parser for SPF and DMARC records."
LICENSE = "Apache-2.0"

PV = "5.10.12"

RPM_NAME = "python314-checkdmarc-5.10.12-1.4.noarch.rpm"
RPM_HASH = "7b05ce79f0801abb65306b691de7edcb821d1c9226ce7ae3eae9793309b74dcdcda1396f9708f173e5f839a44e5af4d80e66687c1670e20bd350f2db123946e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-checkdmarc \
python314-checkdmarc \
python3dist-checkdmarc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-cryptography \
python314-dnspython \
python314-expiringdict \
python314-pem \
python314-publicsuffixlist \
python314-pyOpenSSL \
python314-pyleri \
python314-requests \
python314-timeout-decorator \
python314-xmltodict"

inherit rpm
