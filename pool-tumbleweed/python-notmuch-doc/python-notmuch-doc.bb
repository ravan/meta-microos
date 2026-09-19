SUMMARY = "Documentation of Python bindings for notmuch"
DESCRIPTION = "Documentation of Python interface (bindings) for notmuch"
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "python-notmuch-doc-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "195cf26692eb7872502e6b7d61043659c616b2312c94b1782326626ed00d807cf68adefdad58628c5a94f797652483dfd0fbe09d5eb6793ba20b041e8c112256"

RPROVIDES:${PN} += "python-notmuch-doc"

RDEPENDS:${PN} += ""

inherit rpm
