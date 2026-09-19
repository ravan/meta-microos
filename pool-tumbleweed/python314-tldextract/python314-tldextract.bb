SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "5.3.2"

RPM_NAME = "python314-tldextract-5.3.2-1.1.noarch.rpm"
RPM_HASH = "244507000a18005cb2a09b233272dec7343ea1e6789e98af5b68f22dd6a34fd41799ec2c4bd3e56af7df8f7299f617f4af90cc8db18638270f5f5c2387d5e47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tldextract \
python314-tldextract \
python3dist-tldextract"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-filelock \
python314-idna \
python314-requests \
python314-requests-file \
update-alternatives"

inherit rpm
