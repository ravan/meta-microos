SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.13"

RPM_NAME = "python314-tld-0.13-1.9.noarch.rpm"
RPM_HASH = "3be061c860c95ca73a9935927ed42e123f9717a0a80764c9a716efc1c3afe690e3779b2f0c8569a8964b9234ad443f1a1ba6576a4a5a55387307acf794b3f77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tld \
python314-tld \
python3dist-tld"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
