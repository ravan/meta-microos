SUMMARY = "Documentation for notmuch"
DESCRIPTION = "This package contains the info pages for notmuch."
LICENSE = "GPL-3.0-or-later"

PV = "0.38.3"

RPM_NAME = "notmuch-doc-0.38.3-5.6.aarch64.rpm"
RPM_HASH = "a9cb68587bcdc6e30399937e01680a70b32623bcfecb8a1705c595171e7c013fa797abf7192a46177a27c9b8b4dcdc932cf4ad93ca06b037ddc2fe18f0166c88"

RPROVIDES:${PN} += "notmuch-doc"

RDEPENDS:${PN} += "notmuch"

inherit rpm
