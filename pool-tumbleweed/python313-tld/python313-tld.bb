SUMMARY = "URL top level domain (TLD) extraction module"
DESCRIPTION = "This module extracts the top level domain (TLD) from the URL given. \
A list of TLD names is taken from Mozillas public suffix list: \
<https://publicsuffix.org/list/effective_tld_names.dat>"
LICENSE = "GPL-2.0-only | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.13"

RPM_NAME = "python313-tld-0.13-1.9.noarch.rpm"
RPM_HASH = "9a6c21954ead1aa73d7e4613807be00f7cd7363ffd0145d746a0c6ca1d2bbb202c153e74f7a76d4ecc77615b7347d4368f98f8cd35ed18b7be235bb50f312f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tld \
python3.13dist-tld \
python313-tld \
python3dist-tld"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
