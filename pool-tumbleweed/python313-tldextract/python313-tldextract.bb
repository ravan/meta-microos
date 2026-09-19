SUMMARY = "Python module to separate the TLD of a URL"
DESCRIPTION = "tldextract accurately separates the gTLD or ccTLD (generic or country code \
top-level domain) from the registered domain and subdomains of a URL, using the \
Public Suffix List. By default, this includes the public ICANN TLDs and their \
exceptions. You can optionally support the Public Suffix List's private domains \
as well."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "5.3.2"

RPM_NAME = "python313-tldextract-5.3.2-1.1.noarch.rpm"
RPM_HASH = "ffc5d5e96c3352d151befcb3294f2e66dbe6d74a24f875aa153c83ac9b120d7a3f03dc7bf27dda21dd30e89ee045698dbfa8fb6e805d461bc6daa1d3e51ef759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tldextract \
python3.13dist-tldextract \
python313-tldextract \
python3dist-tldextract"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-filelock \
python313-idna \
python313-requests \
python313-requests-file \
update-alternatives"

inherit rpm
